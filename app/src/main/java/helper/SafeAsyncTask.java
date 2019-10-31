package helper;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

/**
 * @author Dan Mercer
 */

public abstract class SafeAsyncTask<Param,Prog,Res> extends AsyncTask<Param,Prog,Res> {

	public static final String TAG = "SafeAsyncTask";
	private Exception err = null;
	private Context context = null;

	@Override
	protected final Res doInBackground(Param[] objects) {
		try {
			return doInBackgroundSafe(objects);
		} catch (Exception e) {
			err = e;
			return null;
		}
	}

	protected abstract Res doInBackgroundSafe(Param[] objects) throws Exception;

	public SafeAsyncTask<Param, Prog, Res> setContextForToasting(Context context) {
		this.context = context;
		return this; // For chaining
	}

	@Override
	protected final void onPostExecute(Res o) {
		if (err == null) {
			this.onPostSuccessfulExecute(o);
		} else {
			this.onPostFailedExecute(err);
			if (context != null) {
				Toast.makeText(context, err.getMessage(), Toast.LENGTH_SHORT).show();
			} else {
				Log.w(TAG, "Got error but have no context to Toast it with.");
			}
			Log.w("SafeAsyncTask", "Error in doInBackgroundSafe", err);
		}
	}

	private void onPostFailedExecute(Exception err) {
		// Do nothing by default
	}

	protected abstract void onPostSuccessfulExecute(Res o);
}
