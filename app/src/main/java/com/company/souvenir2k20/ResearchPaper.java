package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;

public class ResearchPaper extends AppCompatActivity {

    private final int[] userImage = {

    };

    private final String[] userName ={
    };

    private final String[] userPost = {

    };

    private final String[] userAbstractHeading = {

    };

    private final String[] userAbstract = {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_paper);

        ImageView ivResearch1 = findViewById(R.id.ivReserchPaper1);
        ImageView ivResearch2 = findViewById(R.id.ivReserchPaper2);
        ImageView ivResearch3 = findViewById(R.id.ivReserchPaper3);
        ImageView ivResearch4 = findViewById(R.id.ivReserchPaper4);
        ImageView ivResearch5 = findViewById(R.id.ivReserchPaper5);
        ImageView ivResearch6 = findViewById(R.id.ivReserchPaper6);
        ImageView ivResearch7 = findViewById(R.id.ivReserchPaper7);
        ImageView ivResearch8 = findViewById(R.id.ivReserchPaper8);
        ImageView ivResearch9 = findViewById(R.id.ivReserchPaper9);

        Glide.with(ivResearch1).load(R.drawable.r1).into(ivResearch1);
        Glide.with(ivResearch2).load(R.drawable.r2).into(ivResearch2);
        Glide.with(ivResearch3).load(R.drawable.r3).into(ivResearch3);
        Glide.with(ivResearch4).load(R.drawable.r4).into(ivResearch4);
        Glide.with(ivResearch5).load(R.drawable.r5).into(ivResearch5);
        Glide.with(ivResearch6).load(R.drawable.r6).into(ivResearch6);
        Glide.with(ivResearch7).load(R.drawable.r7).into(ivResearch7);
        Glide.with(ivResearch8).load(R.drawable.r8).into(ivResearch8);
        Glide.with(ivResearch9).load(R.drawable.r9).into(ivResearch9);

//        ivResearch1.setImageResource(R.drawable.r1);
//        ivResearch2.setImageResource(R.drawable.r2);
//        ivResearch3.setImageResource(R.drawable.r3);
//        ivResearch4.setImageResource(R.drawable.r4);
//        ivResearch5.setImageResource(R.drawable.r5);
//        ivResearch6.setImageResource(R.drawable.r6);
//        ivResearch7.setImageResource(R.drawable.r7);
//        ivResearch8.setImageResource(R.drawable.r8);
//        ivResearch9.setImageResource(R.drawable.r9);

        ListView mListResearchPaper = findViewById(R.id.mListResearchPaper);
        Poetry adapter = new Poetry(getApplicationContext(), userName, userImage, userPost,
                userAbstractHeading, userAbstract);
        mListResearchPaper.setAdapter(adapter);
    }
}
