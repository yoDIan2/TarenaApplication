package com.yodian2.tarena.mytravelapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView tvTimer;
    private int i=3;
    private Handler handler;
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTimer = (TextView) findViewById(R.id.tvtimer);
        TextView tvTip = (TextView) findViewById(R.id.tvtip);


        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                    tvTimer.setText(String.valueOf(i));
                    if (i>0){
                        i--;
                        handler.postDelayed(this,1000);
                    }else {
                        goToNextActivity();
                        finish();

                    }

                }

        },1000);



        tvTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
                finish();

            }
        });



    }
    private void goToNextActivity(){
        sp = getSharedPreferences("gars",Context.MODE_PRIVATE);



        boolean isUsed = sp.getBoolean("isUsed",false);
        if (!isUsed){
            startActivity(new Intent(MainActivity.this,FrashGuideActivity.class));
            sp.edit().putBoolean("isUsed",true).commit();
        }else {
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
        }

    }
}
