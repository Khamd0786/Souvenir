package com.company.souvenir2k20.EventBanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.company.souvenir2k20.EventBanner.EventAdapter;
import com.company.souvenir2k20.R;

public class EventBannerActivity extends AppCompatActivity {
    ListView mListEvent;

    String[] names = {
            "Souvenir"
    };
    int[] userImage = {
            R.drawable.souvenir
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_banner);

        mListEvent = findViewById(R.id.mListEvent);

        EventAdapter eventAdapter = new EventAdapter(getApplicationContext(), names, userImage);
        mListEvent.setAdapter(eventAdapter);

    }
}
