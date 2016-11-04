package com.example.pldisample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	private WebView wv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wv = (WebView) this.findViewById(R.id.webview);
		wv.setWebChromeClient(new WebChromeClient());
		wv.setWebViewClient(new WebViewClient());
		wv.getSettings().setJavaScriptEnabled(true);
		wv.addJavascriptInterface(new JSBridge(this), "bridge");
	}
	
	@Override
	protected void onResume(){
		super.onResume();
		wv.loadUrl("file:///android_asset/www/index.html");
	}	
}
