package com.company.souvenir2k20;

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

import java.util.Objects;

class Poetry extends ArrayAdapter {

    private final String[] names;
    private final String[] heading;
    private final String[] post;
    private final String[] article;
    private final int[] userImage;
    private final Context mContext;
    public Poetry(@NonNull Context context, String[] names, int[] userImage, String[] post, String[] heading, String[] article) {
        super(context, R.layout.article_list);
        this.mContext = context;
        this.names = names;
        this.userImage = userImage;
        this.post = post;
        this.heading = heading;
        this.article = article;
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
            convertView = Objects.requireNonNull(layoutInflater).inflate(R.layout.article_list, parent, false);
            mViewHolder.tvUserNameArticle = convertView.findViewById(R.id.tvUserNameArticle);
            mViewHolder.tvUserPostArticle = convertView.findViewById(R.id.tvUserPostArticle);
            mViewHolder.tvHeadingArticle = convertView.findViewById(R.id.tvHeadingArticle);
            mViewHolder.tvArticle = convertView.findViewById(R.id.tvArticle);
            mViewHolder.ivUserArticle = convertView.findViewById(R.id.ivUserArticle);
            convertView.setTag(mViewHolder);

        }   else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mViewHolder.tvUserNameArticle.setText(names[position]);
        mViewHolder.tvUserPostArticle.setText(post[position]);
        mViewHolder.tvHeadingArticle.setText(heading[position]);
//        Glide.with(mContext).load(article[position]).into(mViewHolder.tvArticle);
        mViewHolder.tvArticle.setText(article[position]);
//        mViewHolder.ivUserArticle.setImageResource(userImage[position]);
        Glide.with(mContext).load(userImage[position]).into(mViewHolder.ivUserArticle);


        return convertView;

    }
    static class ViewHolder {
        TextView tvUserNameArticle, tvUserPostArticle, tvHeadingArticle, tvArticle;
        ImageView ivUserArticle;

    }
}
