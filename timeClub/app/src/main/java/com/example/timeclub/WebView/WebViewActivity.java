package com.example.timeclub.WebView;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.timeclub.R;

public class WebViewActivity extends AppCompatActivity {

    private WebView mMVmhtml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mMVmhtml=(WebView)findViewById(R.id.WV_Id);
        mMVmhtml.getSettings().setJavaScriptEnabled(true);
        mMVmhtml.loadUrl("https://m.baidu.com");
        mMVmhtml.setWebViewClient(new MyWebViewClient());
      //  mMVmhtml = (WebView) findViewById(R.id.WV_Id);
        //mMVmhtml.loadUrl("file:///android_asset/hello.html");
    }

    class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return  true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Log.d("WebView","开始访问页面");
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            Log.d("WebView","页面访问结束");
        }
    }

}
