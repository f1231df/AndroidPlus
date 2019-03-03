package com.chao.androidplus.app;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chao.androidplus.R;
import com.chao.androidplus.pagers.TextViewActivity;

public class WelcomeMainActivity extends Activity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_main);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomeMainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
