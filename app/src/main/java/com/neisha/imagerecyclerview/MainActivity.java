package com.neisha.imagerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Bean> beanList;

    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        initData();
        adapter = new MainAdapter(this, beanList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.bindToRecyclerView(recyclerView);
    }

    private void initData() {
        beanList = new ArrayList<>();
        beanList.add(new Bean(1, "text1", R.color.themeBlue));
        beanList.add(new Bean(1, "text1", R.color.themePink));
        beanList.add(new Bean(1, "text1", R.color.themeGreen));
        beanList.add(new Bean(1, "text1", R.color.themeRed));
        beanList.add(new Bean(2, "http://www.fzlu.net/uploads/allimg/150918/3-15091Q00R2a2.jpg"));
        beanList.add(new Bean(1, "text1", R.color.themeOrange));
        beanList.add(new Bean(1, "text1", R.color.themeBrown));
        beanList.add(new Bean(1, "text1", R.color.themeAmber));
        beanList.add(new Bean(2, "http://h.hiphotos.baidu.com/image/pic/item/c8ea15ce36d3d5397966ba5b3187e950342ab0cb.jpg"));
        beanList.add(new Bean(1, "text1", R.color.themeBlue));
        beanList.add(new Bean(1, "text1", R.color.themePink));
        beanList.add(new Bean(1, "text1", R.color.themeGreen));
        beanList.add(new Bean(1, "text1", R.color.themeRed));
        beanList.add(new Bean(2, "http://www.fzlu.net/uploads/allimg/150918/3-15091Q00R2a2.jpg"));
        beanList.add(new Bean(1, "text1", R.color.themeBlue));
        beanList.add(new Bean(1, "text1", R.color.themePink));
        beanList.add(new Bean(1, "text1", R.color.themeGreen));
        beanList.add(new Bean(1, "text1", R.color.themeRed));
    }
}
