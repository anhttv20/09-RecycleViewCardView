package com.example.a09_recycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity
     implements CatAdapter2.ItemClickListener{
    private RecyclerView revCat;
    private CatAdapter2 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        revCat=findViewById(R.id.rev);
        adapter=new CatAdapter2(this);
        LinearLayoutManager manager=new LinearLayoutManager(this,
                RecyclerView.VERTICAL,false);
        revCat.setLayoutManager(manager);
        adapter.setData(getListCat());

        adapter.setClickListener(this);
        revCat.setAdapter(adapter);
    }
    private List<Cat> getListCat() {
        List<Cat> list=new ArrayList<>();
        list.add(new Cat(R.drawable.cat1,"Cat 1"));
        list.add(new Cat(R.drawable.cat2,"Cat 2"));
        list.add(new Cat(R.drawable.cat3,"Cat 3"));
        list.add(new Cat(R.drawable.cat4,"Cat 4"));
        list.add(new Cat(R.drawable.cat5,"Cat 5"));
        list.add(new Cat(R.drawable.cat6,"Cat 6"));

        return list;
    }
    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " +
                adapter.getItem(position) + " " +
                "on item position " + position, Toast.LENGTH_SHORT).show();
    }
}
