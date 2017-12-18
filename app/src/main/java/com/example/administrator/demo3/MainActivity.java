package com.example.administrator.demo3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                显示Intent
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);
                //隐式intent
//                Intent intent = new Intent("com.example.activitytest.ActionStart");
//                intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                startActivity(intent);
                //隐式intent其他用法
//                Intent intent =new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.baidu.com"));
//                startActivity(intent);
                //隐式intent拨打电话
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);
                //通过intent传递数据
//                String data = "hello secondactivity";
//                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
//                intent.putExtra("data",data);
//                startActivity(intent);
                //通过intent接收返回的数据
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    String resultData = data.getStringExtra("data");
                    Log.d("data is",resultData);
                }
        }
    }
}
