package com.company.souvenir2k20.Message;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.company.souvenir2k20.R;

public class MessageDetailActivity extends AppCompatActivity {

    ImageView ivMessageDetailUser;
    TextView tvMessageDetailName, tvMessageDetailPost, tvMessageDetailHeading, tvMessageDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);

        ivMessageDetailUser = findViewById(R.id.ivMesseageDetailUser);
        tvMessageDetailName = findViewById(R.id.tvMessageDetailName);
        tvMessageDetailPost = findViewById(R.id.tvMessageDetailPost);
        tvMessageDetailHeading = findViewById(R.id.tvMessageDetailHeading);
        tvMessageDetail = findViewById(R.id.tvMessageDetail);

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

