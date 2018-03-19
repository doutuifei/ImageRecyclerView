package com.neisha.imagerecyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by muzi on 2018/3/19.
 * 727784430@qq.com
 */

public class CustomImageView extends AppCompatImageView {

    private int mDx;
    private int mMinDx;
    private Drawable drawable;

    public CustomImageView(Context context) {
        this(context, null);
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setDx(int dx) {
        if (getDrawable() == null) {
            return;
        }
        mDx = dx - mMinDx;
        if (mDx <= 0) {
            mDx = 0;
        }
        if (mDx > getDrawable().getBounds().height() - mMinDx) {
            mDx = getDrawable().getBounds().height() - mMinDx;
        }
        invalidate();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mMinDx = h;
    }

    public int getDx() {
        return mDx;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int w = getWidth();
        int h = (int) (getWidth() * 1.0f / drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight());
        drawable.getBounds().bottom = h;
        drawable.getBounds().right = w;
        canvas.save();
        canvas.translate(0, -getDx());
        super.onDraw(canvas);
        canvas.restore();
    }

}
