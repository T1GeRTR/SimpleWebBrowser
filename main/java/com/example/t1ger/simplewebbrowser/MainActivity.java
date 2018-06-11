package com.example.t1ger.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView)findViewById(R.id.webview);
        WebSettings ws = web.getSettings();
        ws.setJavaScriptEnabled(true);
        web.loadUrl("http://google.ru");
        web.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if (web.canGoBack())
            web.goBack();
        else
            super.onBackPressed();
    }

}
