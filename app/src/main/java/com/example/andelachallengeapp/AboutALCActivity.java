package com.example.andelachallengeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        WebView aboutPage = new WebView(this);
        setContentView(aboutPage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebSettings webSettings= aboutPage.getSettings();
        webSettings.setJavaScriptEnabled(true);
        aboutPage.loadUrl(getString(R.string.aboutUrl));
        aboutPage.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });


    }
}
