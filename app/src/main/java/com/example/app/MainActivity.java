package com.example.app;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = findViewById(R.id.activity_main_webview);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);

        mWebView.loadUrl(getString(R.string.web_url));
    }
}
