package com.neisha.imagerecyclerview;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by muzi on 2018/1/29.
 * 727784430@qq.com
 */

public class ThirdAdapter extends BaseMultiItemQuickAdapter<Bean, BaseViewHolder> {

    private Context context;
    private CustomImageView imageView;

    public ThirdAdapter(Context context, List<Bean> data) {
        super(data);
        this.context = context;
        addItemType(1, R.layout.item1);
        addItemType(4, R.layout.item4);
    }

    @Override
    protected void convert(final BaseViewHolder helper, Bean item) {
        switch (item.getItemType()) {
            case 1:
                helper.setText(R.id.item_text, item.getContent());
                helper.setBackgroundColor(R.id.item_text, ContextCompat.getColor(context, item.getColor()));
                break;
            case 4:
                imageView = (CustomImageView)helper.getView(R.id.img);
                Glide.with(context).load(item.getContent()).into(imageView);
                break;
        }
    }
}
