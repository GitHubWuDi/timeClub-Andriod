package com.example.timeclub;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.timeclub.WebView.WebViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mWVButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWVButton=(Button) findViewById(R.id.WVButton_Id);
        setlistener();
    }

    public void setlistener(){
        ButtonClickListener listener =new ButtonClickListener();
        mWVButton.setOnClickListener(listener);
    }

    class ButtonClickListener implements OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.WVButton_Id:
                    intent =new Intent(MainActivity.this, WebViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
