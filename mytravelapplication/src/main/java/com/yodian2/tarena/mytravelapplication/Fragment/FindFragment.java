package com.yodian2.tarena.mytravelapplication.Fragment;


import android.os.Bundle;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yodian2.tarena.mytravelapplication.Adapter.MyFragmentPagerAdapter;
import com.yodian2.tarena.mytravelapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {


    private ViewPager viewPager;
    private MyFragmentPagerAdapter adapter;
    private FragmentManager fragmentManager;
    private List<Fragment> fragments;

    public FindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_find, container, false);
        fragments = new ArrayList<>();
        Fragment tabfragmenta = new TabFragmentA();
        Fragment tabfragmentb = new TabFragmentB();
        Fragment tabfragmentc = new TabFragmentC();
        Fragment tabfragmentd = new TabFragmentD();
        Fragment tabfragmente = new TabFragmentE();
        Fragment tabfragmentf = new TabFragmentF();
        Fragment tabfragmentg = new TabFragmentG();
        fragments.add(tabfragmenta);
        fragments.add(tabfragmentb);
        fragments.add(tabfragmentc);
        fragments.add(tabfragmentd);
        fragments.add(tabfragmente);
        fragments.add(tabfragmentf);
        fragments.add(tabfragmentg);
        fragmentManager = getChildFragmentManager();
        adapter = new MyFragmentPagerAdapter(fragmentManager);
        adapter.setFragments(fragments);
        viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0,true);
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabmenu);
        tabLayout.setupWithViewPager(viewPager);
        resetTablayout(tabLayout);


        return view;
    }
    private void resetTablayout(TabLayout tabLayout){
        String[] strs = {"热点","社会","体育","娱乐","影视","动漫","图片"};
        for (int i = 0;i<strs.length;i++){
            tabLayout.getTabAt(i).setText(strs[i]);
        }
    }



}
