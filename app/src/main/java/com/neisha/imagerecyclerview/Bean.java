package com.neisha.imagerecyclerview;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * Created by muzi on 2018/1/29.
 * 727784430@qq.com
 */

public class Bean implements MultiItemEntity {

    private int type;

    private String content;

    private int color;


    public Bean() {
    }

    public Bean(int type, String content, int color) {
        this.type = type;
        this.content = content;
        this.color = color;
    }

    public Bean(int type, String content) {
        this.type = type;
        this.content = content;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getItemType() {
        return type;
    }
}
