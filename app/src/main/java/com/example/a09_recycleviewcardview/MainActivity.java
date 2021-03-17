package com.example.a09_recycleviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView revCat;
    private CatAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        revCat=findViewById(R.id.rev);
        adapter=new CatAdapter(this);
        GridLayoutManager manager=new GridLayoutManager(this,3);
        revCat.setLayoutManager(manager);
        adapter.setData(getListCat());
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
}
