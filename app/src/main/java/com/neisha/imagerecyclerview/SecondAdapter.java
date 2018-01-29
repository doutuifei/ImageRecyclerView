package com.neisha.imagerecyclerview;

import android.content.Context;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import io.github.bleoo.windowImageView.WindowImageView;

/**
 * Created by muzi on 2018/1/29.
 * 727784430@qq.com
 */

public class SecondAdapter extends BaseMultiItemQuickAdapter<Bean, BaseViewHolder> {

    private Context context;
    private RecyclerView recyclerView;
    private WindowImageView imageView;

    public SecondAdapter(Context context, List<Bean> data) {
        super(data);
        this.context = context;
        addItemType(1, R.layout.item1);
        addItemType(3, R.layout.item3);
    }

    @Override
    protected void convert(final BaseViewHolder helper, Bean item) {
        switch (item.getItemType()) {
            case 1:
                helper.setText(R.id.item_text, item.getContent());
                helper.setBackgroundColor(R.id.item_text, ContextCompat.getColor(context, item.getColor()));
                break;
            case 3:
                if (recyclerView == null) {
                    recyclerView = getRecyclerView();
                }
                imageView = helper.getView(R.id.wiv);
                imageView.setFrescoEnable(true);
                imageView.bindRecyclerView(recyclerView);
                imageView.setImageURI(Uri.parse(item.getContent()));
                break;
        }
    }
}
