package com.ziru.sdjoamobile;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class main extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	Log.e("ZIRU_INTENT", "onCreate");
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        IntentUtils.tryOneOfThese(this);
        
    }
  
    @Override
    protected void onResume() {
        super.onResume();

    	Log.e("ZIRU_INTENT", "onResume");
    }
    
    @Override
    protected void onStart() {
        super.onStart();

    	Log.e("ZIRU_INTENT", "onStart");
    }    
    
    @Override
    protected void onStop() {
        super.onStop();

    	Log.e("ZIRU_INTENT", "onStop");
    }  
    
    @Override
    protected void onPause() {
        super.onPause();

    	Log.e("ZIRU_INTENT", "onPause");
    } 
    
    @Override
    protected void onRestart() {
    	Log.e("ZIRU_INTENT", "onRestart");
    	super.onRestart();

    	
    } 
    
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        
    	Log.e("ZIRU_INTENT", "onDestroy");
    }
    
}