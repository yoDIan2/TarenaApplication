package com.yodian2.tarena.mytravelapplication.Fragment;


import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.yodian2.tarena.mytravelapplication.FrashGuideActivity;
import com.yodian2.tarena.mytravelapplication.HomeActivity;
import com.yodian2.tarena.mytravelapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuideFragmentC extends Fragment implements View.OnClickListener {


    public GuideFragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_guide_fragment_c, container, false);
        Button button = (Button) view.findViewById(R.id.btnguide);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getActivity(),HomeActivity.class));
        getActivity().finish();


    }
}
