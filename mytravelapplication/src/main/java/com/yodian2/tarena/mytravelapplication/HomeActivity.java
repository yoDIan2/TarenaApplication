package com.yodian2.tarena.mytravelapplication;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.yodian2.tarena.mytravelapplication.Fragment.FindFragment;
import com.yodian2.tarena.mytravelapplication.Fragment.HotFragment;
import com.yodian2.tarena.mytravelapplication.Fragment.LikeFragment;
import com.yodian2.tarena.mytravelapplication.Fragment.MineFragment;

public class HomeActivity extends AppCompatActivity {


    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.hometoolbar);
        setSupportActionBar(toolbar);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.homecontent,new HotFragment());
        fragmentTransaction.commit();
        ImageView imglogin = (ImageView) findViewById(R.id.toolbarlogin);
        imglogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });




        RadioGroup ragmenubottom = (RadioGroup) findViewById(R.id.ragmenubottom);
        ragmenubottom.check(R.id.rabtnhot);
        ragmenubottom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                switch (checkedId){
                    case R.id.rabtnhot:
                        fragmentTransaction1.replace(R.id.homecontent, new HotFragment());
                        break;
                    case R.id.rabtnfind:
                        fragmentTransaction1.replace(R.id.homecontent,new FindFragment());
                        break;
                    case R.id.rabtnlike:
                        fragmentTransaction1.replace(R.id.homecontent,new LikeFragment());
                        break;
                    case R.id.rabtnmore:
                        fragmentTransaction1.replace(R.id.homecontent,new MineFragment());
                        break;
                }
                fragmentTransaction1.commit();


            }
        });
    }
}
