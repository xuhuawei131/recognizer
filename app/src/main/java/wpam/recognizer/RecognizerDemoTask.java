package wpam.recognizer;

import android.os.AsyncTask;
import android.util.Log;

import java.util.concurrent.BlockingQueue;

public class RecognizerDemoTask extends AsyncTask<Void, Object, Void> {



	public RecognizerDemoTask()
	{

	}

	@Override
	protected Void doInBackground(Void... params)
	{
		Log.v("xhw","RecognizerDemoTask doInBackground");
		
		return null;
	}
	
	protected void onProgressUpdate(Object... progress) 
	{

    }
}
