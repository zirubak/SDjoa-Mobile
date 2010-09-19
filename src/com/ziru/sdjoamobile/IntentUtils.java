package com.ziru.sdjoamobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class IntentUtils {
	
	public static void invokeWebBrowser(Activity activity)
	{
		Log.e("ZIRU_INTENT", "invokeWebBrowser");
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://www.sdjoa.com"));
		activity.startActivity(intent);
	}
	
	public static void tryOneOfThese(Activity activity)
	{
		Log.e("ZIRU_INTENT", "tryOneOfThese");
		
		IntentUtils.invokeWebBrowser(activity);
	}
}
