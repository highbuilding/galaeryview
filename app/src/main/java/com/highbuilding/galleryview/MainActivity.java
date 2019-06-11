package com.highbuilding.galleryview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private ScaleHelper mCardScaleHelper;
    private List<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleView = findViewById(R.id.rv_gallery);
        mList = new ArrayList<>();
        mList.add("11");
        mList.add("22");
        mList.add("33");
        mList.add("44");
        mList.add("55");
        mList.add("66");


        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecycleView.setLayoutManager(linearLayoutManager);
        mRecycleView.setAdapter(new BlueDeviceAdapter(this, mList));
        // mRecyclerView绑定scale效果
        mCardScaleHelper = new ScaleHelper();
        mCardScaleHelper.setCurrentItemPos(0);
        mCardScaleHelper.setScale(0.90f);
        mCardScaleHelper.attachToRecyclerView(mRecycleView);
    }
}
