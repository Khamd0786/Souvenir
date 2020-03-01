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

public class AbstractResearchPaperAdapter extends ArrayAdapter {

    private String[] names;
    private String[] heading;
    private String[] post;
    private String[] article;
    private int[] userImage;
    private Context mContext;
    public AbstractResearchPaperAdapter(@NonNull Context context, String[] names, int[] userImage, String[] post, String[] heading, String[] article) {
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
            convertView = layoutInflater.inflate(R.layout.article_list, parent, false);
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
        mViewHolder.tvArticle.setText(article[position]);
        mViewHolder.ivUserArticle.setImageResource(userImage[position]);


        return convertView;

    }
    static class ViewHolder {
        TextView tvUserNameArticle, tvUserPostArticle, tvHeadingArticle, tvArticle;
        ImageView ivUserArticle;

    }
}
