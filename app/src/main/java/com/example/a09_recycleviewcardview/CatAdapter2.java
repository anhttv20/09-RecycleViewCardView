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

public class CatAdapter2 extends
        RecyclerView.Adapter<CatAdapter2.CatViewHolder2>{
    private Context mContext;
    private List<Cat> mlist;
    private ItemClickListener mClickListener;

    public CatAdapter2(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<Cat> list){
        this.mlist=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CatAdapter2.CatViewHolder2
    onCreateViewHolder(@NonNull ViewGroup parent,
                       int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_cat2,
                parent,false);
        return new CatAdapter2.CatViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull
               CatAdapter2.CatViewHolder2 holder,
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
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
    public String getItem(int pos) {
        return mlist.get(pos).getName();
    }

    public class CatViewHolder2 extends RecyclerView.ViewHolder
         implements View.OnClickListener{
        private ImageView imgCat;
        private TextView tvName;
        public CatViewHolder2(@NonNull View view) {
            super(view);
            imgCat=view.findViewById(R.id.img);
            tvName=view.findViewById(R.id.tv_name);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null)
                mClickListener.onItemClick(v, getAdapterPosition());
        }

    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
