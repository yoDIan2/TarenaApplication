package com.yodian2.tarena.dazhongapplication.ui.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yodian2.tarena.dazhongapplication.R;
import com.yodian2.tarena.dazhongapplication.ui.ui.utli.SPUtil;

public class SpalshActivity extends AppCompatActivity {
        Intent intent;
    SPUtil spUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        spUtil=new SPUtil(this,"sp");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (spUtil.getFirst()){
                    intent = new Intent(SpalshActivity.this,GuideActivity.class);
                    spUtil.setFirst(false);
                }else {
                    intent = new Intent(SpalshActivity.this,MainActivity.class);
                }
                startActivity(intent);
                finish();

            }
        },1500);
    }
}
