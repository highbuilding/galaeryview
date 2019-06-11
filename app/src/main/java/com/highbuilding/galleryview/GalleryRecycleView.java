package com.highbuilding.galleryview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * created by xiangrong@baidu.com
 **/
public class GalleryRecycleView extends RecyclerView {
    private LinearSnapHelper linearSnapHelper;

    public GalleryRecycleView(@NonNull Context context) {
        super(context);
    }

    public GalleryRecycleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GalleryRecycleView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void init() {
        linearSnapHelper = new LinearSnapHelper();
        linearSnapHelper.attachToRecyclerView(this);
    }


}
