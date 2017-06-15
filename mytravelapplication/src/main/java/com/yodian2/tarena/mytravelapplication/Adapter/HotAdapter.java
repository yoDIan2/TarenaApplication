package com.yodian2.tarena.mytravelapplication.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yodian2.tarena.mytravelapplication.Entity.ReItme;
import com.yodian2.tarena.mytravelapplication.R;

import java.util.List;

/**
 * Created by tarena on 2017/5/25.
 */

public class HotAdapter extends RecyclerView.Adapter<HotAdapter.MyViewHolder> {
    private List<ReItme> dataset;
    public void setDataset(List<ReItme> dataset){
        this.dataset = dataset;

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle;
        private ImageView img1;
        private ImageView img2;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.itemtitle);
            img1 = (ImageView) itemView.findViewById(R.id.imgcontent1);
            img2 = (ImageView) itemView.findViewById(R.id.imgcontent2);


        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyitem,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvTitle.setText(dataset.get(position).getTitle());
        holder.img1.setImageResource(dataset.get(position).getImg1());
        holder.img2.setImageResource(dataset.get(position).getImg2());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
