package com.example.administrator.demo3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/12/14.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        //通过intent获取数据
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("data");
//        Log.d("data is :",data);
        //通过intent返回数据给上一个活动(点击按钮后返回上一个活动并返回数据)
        Button button =findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "hello mainActivity";
                Intent intent = new Intent();
                intent.putExtra("data",data);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
