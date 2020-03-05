package com.company.souvenir2k20.Message;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.company.souvenir2k20.R;

public class MessageDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);

        ImageView ivMessageDetailUser = findViewById(R.id.ivMesseageDetailUser);
        TextView tvMessageDetailName = findViewById(R.id.tvMessageDetailName);
        TextView tvMessageDetailPost = findViewById(R.id.tvMessageDetailPost);
        TextView tvMessageDetailHeading = findViewById(R.id.tvMessageDetailHeading);
        TextView tvMessageDetail = findViewById(R.id.tvMessageDetail);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            ivMessageDetailUser.setImageResource(bundle.getInt("messageUserImage"));
            tvMessageDetailName.setText(bundle.getString("messageName"));
            tvMessageDetailPost.setText(bundle.getString("messagePost"));
            tvMessageDetailHeading.setText(bundle.getString("messageHeading"));
//            if (bundle.getString("messageDetail") != null) {
                tvMessageDetail.setText(bundle.getString("messageDetail"));
//            } else {
//                tvMessageDetail.setText("");
//            }
        }

    }
}

