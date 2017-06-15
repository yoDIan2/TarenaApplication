package com.yodian2.tarena.mytravelapplication;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.yodian2.tarena.mytravelapplication.Adapter.MyFragmentPagerAdapter;
import com.yodian2.tarena.mytravelapplication.Fragment.GuideFragmentA;
import com.yodian2.tarena.mytravelapplication.Fragment.GuideFragmentB;
import com.yodian2.tarena.mytravelapplication.Fragment.GuideFragmentC;

import java.util.ArrayList;
import java.util.List;

public class FrashGuideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {
        private List<Fragment> fragments = new ArrayList<>();
    private ViewPager viewPager;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frash_guide);


        radioGroup = (RadioGroup) findViewById(R.id.ragguide);
        radioGroup.check(R.id.rabtna);
        radioGroup.setOnCheckedChangeListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewpagerguide);
        Fragment fragmentA = new GuideFragmentA();
        Fragment fragmentB = new GuideFragmentB();
        Fragment fragmentC = new GuideFragmentC();
        fragments.add(fragmentA);
        fragments.add(fragmentB);
        fragments.add(fragmentC);
        FragmentManager fragmentManager = getSupportFragmentManager();
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(fragmentManager);
        adapter.setFragments(fragments);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0,true);
        viewPager.addOnPageChangeListener(this);
    }



    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:radioGroup.check(R.id.rabtna);
                break;
            case 1:radioGroup.check(R.id.rabtnb);
                break;
            case 2:radioGroup.check(R.id.rabtnc);
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId){
            case R.id.rabtna:viewPager.setCurrentItem(0,true);
                break;
            case R.id.rabtnb:viewPager.setCurrentItem(1,true);
                break;
            case R.id.rabtnc:viewPager.setCurrentItem(2,true);
                break;
        }
    }
}
