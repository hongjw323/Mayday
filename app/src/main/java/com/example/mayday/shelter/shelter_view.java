package com.example.mayday.shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.mayday.R;

import java.util.ArrayList;
import java.util.List;

public class shelter_view extends BaseAdapter {
    Context mConetext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<shelterBean> mList;

    public shelter_view(Context context, ArrayList<shelterBean> data) {
        mConetext = context;
        mList = data;
        mLayoutInflater = LayoutInflater.from(mConetext);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public shelterBean getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mConetext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.activity_shelter_view,null);

        ImageView img_shelter = (ImageView) convertView.findViewById(R.id.img_shelter);
        TextView txt_sname = convertView.findViewById(R.id.txt_sname);
        TextView txt_saddr = convertView.findViewById(R.id.txt_saddr);
        TextView txt_sdst = convertView.findViewById(R.id.txt_sdst);

        img_shelter.setImageResource(mList.get(position).getImg_shelter());
        txt_sname.setText(mList.get(position).getTxt_sname());
        txt_saddr.setText(mList.get(position).getTxt_saddr());
        txt_sdst.setText(mList.get(position).getTxt_sdst());

        return convertView;
    }
}
