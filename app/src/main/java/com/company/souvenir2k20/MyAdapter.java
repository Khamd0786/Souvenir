package com.company.souvenir2k20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {

    String[] names;
//    int[] flags;
    Context mContext;
    public MyAdapter(@NonNull Context context, String[] names) {
        super(context, R.layout.content_list);
        this.names = names;
//        this.flags = flags;
        this.mContext = context;
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
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.content_list, parent, false);
//            mViewHolder.mFlag = (ImageView) convertView.findViewById(R.id.ivCountryFlag);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.tvContent);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
//        mViewHolder.mFlag.setImageResource(flags[position]);
        mViewHolder.mName.setText(names[position]);
        return convertView;
    }
    static class ViewHolder {
        TextView mName;
//        ImageView mFlag;
    }
}
