package com.hss.project.mysdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MySDKMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sdkmain);
    }
    public void onClick(View view){
        Toast.makeText(this,"我自己封装的SDK",Toast.LENGTH_SHORT).show();

    }
}
