package com.example.a09_recycleviewcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatAdapter extends
        RecyclerView.Adapter<CatAdapter.CatViewHolder> {
    private Context mContext;
    private List<Cat> mlist;
    public CatAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<Cat> list){
        this.mlist=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                            int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat,
                parent,false);
        return new CatViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder,
                                 int position) {
           Cat cat=mlist.get(position);
           if(cat==null)
               return;
           holder.imgCat.setImageResource(cat.getSourceImage());
           holder.tvName.setText(cat.getName());
    }
    @Override
    public int getItemCount() {
        if(mlist!=null){
            return mlist.size();
        }
        return 0;
    }
    public class CatViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCat;
        private TextView tvName;
        public CatViewHolder(@NonNull View view) {
            super(view);
            imgCat=view.findViewById(R.id.img);
            tvName=view.findViewById(R.id.tv_name);

        }
    }
}
