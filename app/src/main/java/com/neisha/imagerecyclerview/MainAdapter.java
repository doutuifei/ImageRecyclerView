package com.neisha.imagerecyclerview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by muzi on 2018/1/29.
 * 727784430@qq.com
 */

public class MainAdapter extends BaseMultiItemQuickAdapter<Bean, BaseViewHolder> {

    private Context context;
    private RecyclerView recyclerView;

    public MainAdapter(Context context, List<Bean> data) {
        super(data);
        this.context = context;
        addItemType(1, R.layout.item1);
        addItemType(2, R.layout.item2);
    }

    @Override
    protected void convert(final BaseViewHolder helper, Bean item) {
        switch (item.getItemType()) {
            case 1:
                helper.setText(R.id.item_text, item.getContent());
                helper.setBackgroundColor(R.id.item_text, ContextCompat.getColor(context, item.getColor()));
                break;
            case 2:
                if (recyclerView == null) {
                    recyclerView = getRecyclerView();
                }
                Glide.with(context).load(item.getContent()).into(new SimpleTarget<Drawable>() {
                    @Override
                    public void onResourceReady(Drawable resource, Transition<? super Drawable> transition) {
                        recyclerView.setBackground(resource);
                    }
                });
                break;
        }
    }
}
