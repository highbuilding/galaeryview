package com.highbuilding.galleryview;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * created by xiangrong@baidu.com
 **/
public class BlueDeviceAdapter extends RecyclerView.Adapter<BlueDeviceAdapter.ViewHolder> implements View.OnClickListener, View.OnLongClickListener {
    private Context context;
    private List<String> mList;

    private OnItemSelectedListener onItemSelectedListener;

    public BlueDeviceAdapter(Context context, List<String> mList) {
        this.context = context;
        this.mList = mList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_btdevice, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        /**
         * 给itemView设置tag
         */
        final String name = mList.get(position);

        holder.itemView.setTag(position);
        holder.tvDeviceName.setText("小度智能音箱酒店版-" + name);


    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivImage;
        public TextView tvDeviceName;
        public Button btActivate;

        public ViewHolder(View itemView) {
            super(itemView);
            ivImage = (ImageView) itemView.findViewById(R.id.image);
            tvDeviceName = (TextView) itemView.findViewById(R.id.bt_device_name);
            btActivate = (Button) itemView.findViewById(R.id.bt_start_config);
        }
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    public interface OnItemSelectedListener {
        void onItemSelected(BluetoothDevice bluetoothDevice);
    }
}
