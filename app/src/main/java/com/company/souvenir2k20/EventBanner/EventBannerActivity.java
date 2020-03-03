package com.company.souvenir2k20.EventBanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.company.souvenir2k20.EventBanner.EventAdapter;
import com.company.souvenir2k20.R;

public class EventBannerActivity extends AppCompatActivity {
    ListView mListEvent;

    String[] names = {
            "Cerebrum (Human Poster)",
            "Souvenir",
            "Souvenir CD",
            "Candle March",
            "Chota Bheem",
            "Code Battle",
            "Dumb Charades",
            "Gully Cricket",
            "Mini Volleyball",
            "Model Presentation",
            "PUBG Competitioln",
            "Roadshow",
            "Robo Race",
            "Sack Race",
            "Slow Bike Race",
            "Tambola",
            "Three Leg Race",
            "Treasure Hunt",
            "Tug Of War",
            "Twinning",
            "Kartavya",
            "Technical Paper Presentation",
            "Poster Presentation",
            "Cultural Events",
            "Technical Poster"



    };
    int[] userImage = {
            R.drawable.cerebrum_human,
            R.drawable.souvenir,
            R.drawable.souvenir_cd,
            R.drawable.candle_marche,
            R.drawable.chota_bheem,
            R.drawable.code_battle,
            R.drawable.dumb_charades,
            R.drawable.gully_cricket,
            R.drawable.mini_volleyball,
            R.drawable.model_presentation,
            R.drawable.pubg_competetion,
            R.drawable.roadshow,
            R.drawable.robo_race,
            R.drawable.sack_race,
            R.drawable.slow_bike_race,
            R.drawable.tambola,
            R.drawable.three_leg_race,
            R.drawable.tresure_hunt,
            R.drawable.tug_of_war,
            R.drawable.twinnig,
            R.drawable.kartavya,
            R.drawable.technical_paper_presentation,
            R.drawable.poster_presentation,
            R.drawable.cultural_events,
            R.drawable.technical_poster


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
