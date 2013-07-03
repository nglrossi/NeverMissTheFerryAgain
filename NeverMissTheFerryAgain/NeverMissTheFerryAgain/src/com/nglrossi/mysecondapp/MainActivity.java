package com.nglrossi.mysecondapp;

import com.nglrossi.mysecondapp.FerryTime;
import com.nglrossi.MyTime;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.view.Menu;
//import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private static final FerryTime ferryTime = new FerryTime();
	// public static final String EXTRA_MESSAGE =
	// "com.nglrossi.mysecondapp.MESSAGE";

	// used for calling back the same method over and over again
	private Handler mHandler = new Handler();

	// protected void keepRedrawing() {
	private Runnable keepRedrawing = new Runnable() {
		public void run() {

			// Current time
			MyTime now = new MyTime();
			now.setToNow();

			// get the time left for both trips
			String nextFerryToCircularQuay = ferryTime
					.countDownToCircularQuay(now);
			String nextFerryToManly = ferryTime.countDownToManly(now);

			// update widgets
			TextView editViewMinutesToCircularQuay = (TextView) findViewById(R.id.countdown_to_circular_quay);
			TextView editViewCountdownToManly = (TextView) findViewById(R.id.countdown_to_manly);
			editViewMinutesToCircularQuay.setText(nextFerryToCircularQuay);
			editViewCountdownToManly.setText(nextFerryToManly);

			// do it again after 1 second
			mHandler.removeCallbacks(keepRedrawing);
			mHandler.postDelayed(keepRedrawing, 1000);
		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		super.onResume();
		mHandler.removeCallbacks(keepRedrawing);
		mHandler.postDelayed(keepRedrawing, 100);
	}

	@Override
	protected void onPause() {		
		super.onPause();
		mHandler.removeCallbacks(keepRedrawing);		
	}

	// @Override
	// public boolean onCreateOptionsMenu(Menu menu) {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }

	// /** Called when the user clicks the Send button */
	// public void sendMessage(View view) {
	// // Do something in response to button
	// Intent intent = new Intent(this, DisplayMessageActivity.class);
	// //EditText editText = (EditText) findViewById(R.id.edit_message);
	// //String message = editText.getText().toString();
	// //intent.putExtra(EXTRA_MESSAGE, message);
	// startActivity(intent);
	//
	// }

}
