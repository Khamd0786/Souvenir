package com.company.souvenir2k20.Message;


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

public class MessageAdapter extends ArrayAdapter<String> {

    private String[] names;
    private String[] heading;
    private String[] post;
    private int[] userImage;
    private Context mContext;

    public MessageAdapter(@NonNull Context context, String[] names, int[] userImage, String[] post, String[] heading) {
        super(context, R.layout.message_list);
        this.names = names;
        this.userImage = userImage;
        this.mContext = context;
        this.post = post;
        this.heading = heading;
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
            convertView = layoutInflater.inflate(R.layout.message_list, parent, false);
            mViewHolder.userImage =  convertView.findViewById(R.id.ivMessageUser);
            mViewHolder.messageHeading =  convertView.findViewById(R.id.tvMessageHeading);
            mViewHolder.messageName =  convertView.findViewById(R.id.tvMessageName);
            mViewHolder.messagePost =  convertView.findViewById(R.id.tvMessagePost);
            convertView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
//        mViewHolder.userImage.setImageResource(userImage[position]);
        Glide.with(mContext).load(userImage[position]).into(mViewHolder.userImage);
        mViewHolder.messageName.setText(names[position]);
        mViewHolder.messagePost.setText(post[position]);
        mViewHolder.messageHeading.setText(heading[position]);
        return convertView;
    }
    static class ViewHolder {
        TextView messageHeading;
        TextView messagePost;
        TextView messageName;
        ImageView userImage;
    }
}
