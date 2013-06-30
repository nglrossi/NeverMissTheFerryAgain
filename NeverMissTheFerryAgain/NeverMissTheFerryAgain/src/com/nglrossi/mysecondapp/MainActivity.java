package com.nglrossi.mysecondapp;

import com.nglrossi.mysecondapp.FerryTime;
import com.nglrossi.MyTime;

import android.app.Activity;
//import android.content.Intent;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
    private static final FerryTime ferryTime = new FerryTime();
    //public static final String EXTRA_MESSAGE = "com.nglrossi.mysecondapp.MESSAGE";


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	}
        
	@Override
    protected void onResume() {
        super.onResume();
        
        // Current time
        MyTime now = new MyTime();
        now.setToNow();
       
        
        // *********************************************
        // Trip to Circular Quay
        // *********************************************
        
        // find when it's the next ferry
//        FerryTime ferryTime = new FerryTime();
        String nextFerryToCircularQuay = ferryTime.countDownToCircularQuay(now);
        String nextFerryToManly = ferryTime.countDownToManly(now);
        
        // update widgets
        TextView editViewMinutesToCircularQuay = (TextView) findViewById(R.id.countdown_to_circular_quay);
        editViewMinutesToCircularQuay.setText(nextFerryToCircularQuay);
        
        
        
        // *********************************************
        // Trip to Manly
        // *********************************************
        TextView editViewCountdownToManly = (TextView) findViewById(R.id.countdown_to_manly);
        editViewCountdownToManly.setText(nextFerryToManly);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);        
//        return true;
//    }
    
//    /** Called when the user clicks the Send button */
//    public void sendMessage(View view) {
//        // Do something in response to button
//    	Intent intent = new Intent(this, DisplayMessageActivity.class);
//    	//EditText editText = (EditText) findViewById(R.id.edit_message);
//    	//String message = editText.getText().toString();
//    	//intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//
//    }
    
}
