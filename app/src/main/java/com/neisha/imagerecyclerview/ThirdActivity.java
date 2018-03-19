package com.neisha.imagerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Bean> beanList;

    private ThirdAdapter adapter;

    private LinearLayoutManager mLinearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        initData();
        adapter = new ThirdAdapter(this, beanList);
        mLinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLinearLayoutManager);
        adapter.bindToRecyclerView(recyclerView);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                int fPos = mLinearLayoutManager.findFirstVisibleItemPosition();
                int lPos = mLinearLayoutManager.findLastCompletelyVisibleItemPosition();
                for (int i = fPos; i <= lPos; i++) {
                    View view = mLinearLayoutManager.findViewByPosition(i);
                    CustomImageView imageView = view.findViewById(R.id.img);
                    if (imageView != null && imageView.getVisibility() == View.VISIBLE) {
                        imageView.setDx(mLinearLayoutManager.getHeight() - view.getTop());
                    }
                }
            }
        });
    }

    private void initData() {
        beanList = new ArrayList<>();
        beanList.add(new Bean(1, "text1", R.color.themeBlue));
        beanList.add(new Bean(1, "text1", R.color.themePink));
        beanList.add(new Bean(1, "text1", R.color.themeGreen));
        beanList.add(new Bean(1, "text1", R.color.themeRed));
        beanList.add(new Bean(4, "http://www.fzlu.net/uploads/allimg/150918/3-15091Q00R2a2.jpg"));
        beanList.add(new Bean(1, "text1", R.color.themeOrange));
        beanList.add(new Bean(1, "text1", R.color.themeBrown));
        beanList.add(new Bean(1, "text1", R.color.themeAmber));
        beanList.add(new Bean(4, "http://h.hiphotos.baidu.com/image/pic/item/c8ea15ce36d3d5397966ba5b3187e950342ab0cb.jpg"));
        beanList.add(new Bean(1, "text1", R.color.themeBlue));
        beanList.add(new Bean(1, "text1", R.color.themePink));
        beanList.add(new Bean(1, "text1", R.color.themeGreen));
        beanList.add(new Bean(1, "text1", R.color.themeRed));
        beanList.add(new Bean(4, "http://www.fzlu.net/uploads/allimg/150918/3-15091Q00R2a2.jpg"));
        beanList.add(new Bean(1, "text1", R.color.themeBlue));
        beanList.add(new Bean(1, "text1", R.color.themePink));
        beanList.add(new Bean(1, "text1", R.color.themeGreen));
        beanList.add(new Bean(1, "text1", R.color.themeRed));
    }

}
