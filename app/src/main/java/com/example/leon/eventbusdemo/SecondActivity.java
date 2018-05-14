package com.example.leon.eventbusdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.leon.eventbusdemo.bean.MessageEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by leon on 2018/5/14.
 */

public class SecondActivity extends AppCompatActivity {
    private Button mButton2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        mButton2 = findViewById(R.id.btn2);
        jumpActivity();
    }

    private void jumpActivity() {
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent("欢迎大家浏览我写的博客"));
                finish();
            }
        });
    }

}
