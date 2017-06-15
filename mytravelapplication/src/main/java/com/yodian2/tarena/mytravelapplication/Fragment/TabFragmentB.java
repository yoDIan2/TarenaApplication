package com.yodian2.tarena.mytravelapplication.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yodian2.tarena.mytravelapplication.Adapter.HotAdapter;
import com.yodian2.tarena.mytravelapplication.Entity.ReItme;
import com.yodian2.tarena.mytravelapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragmentB extends Fragment {
    private List<ReItme> dataset;

    public TabFragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tab_fragment_b, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        HotAdapter adapter = new HotAdapter();
        dataset = new ArrayList<>();
        intidataset();
        adapter.setDataset(dataset);

        recyclerView.setAdapter(adapter);
        return view;

    }
    private void intidataset(){
        for (int i = 0;i<9;i++){
            ReItme itme = new ReItme("如果你遇到这样的人"+i,R.drawable.tu1,R.drawable.tu5);
            dataset.add(itme);
        }

    }

}
