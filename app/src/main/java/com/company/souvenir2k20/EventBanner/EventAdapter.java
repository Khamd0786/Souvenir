package com.company.souvenir2k20.EventBanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.company.souvenir2k20.R;

public class EventAdapter extends ArrayAdapter {
    private String[] names;
    private int[] userImage;
    private Context context;

    public EventAdapter (@NonNull Context context, String[] names, int[] userImage){
        super(context, R.layout.event_list);
        this.context = context;
        this.names = names;
        this.userImage = userImage;

    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.event_list, parent, false);
            mViewHolder.tvEventList = (TextView) convertView.findViewById(R.id.tvEventList);
            mViewHolder.ivEventList = (ImageView) convertView.findViewById(R.id.ivEventList);
            convertView.setTag(mViewHolder);
        }   else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        Glide.with(context).load(userImage[position]).into(mViewHolder.ivEventList);
//        mViewHolder.ivEventList.setImageResource(userImage[position]);
        mViewHolder.tvEventList.setText(names[position]);
        return convertView;



    }
    static class ViewHolder{
        TextView tvEventList;
        ImageView ivEventList;
    }
}
