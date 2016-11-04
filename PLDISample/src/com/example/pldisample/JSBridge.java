package com.example.pldisample;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.webkit.JavascriptInterface;

public class JSBridge {

	private Context ctxt;
	
	public JSBridge(Context ctxt){
		this.ctxt = ctxt;
	}
	
	@JavascriptInterface
	public String getPhoneNumber(){
		TelephonyManager tm = (TelephonyManager) ctxt.getSystemService(Context.TELEPHONY_SERVICE);
		return tm.getLine1Number();
	}
}
