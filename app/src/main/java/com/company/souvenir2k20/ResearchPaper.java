package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;

public class ResearchPaper extends AppCompatActivity {

    ListView mListResearchPaper;

    ImageView ivResearch1, ivResearch2, ivResearch3,
            ivResearch4, ivResearch5, ivResearch6, ivResearch7, ivResearch8, ivResearch9;

    int[] userImage = {

    };

    String[] userName ={
    };

    String[] userPost = {

    };

    String[] userAbstractHeading = {

    };

    String[] userAbstract = {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_paper);

        ivResearch1 = findViewById(R.id.ivReserchPaper1);
        ivResearch2 = findViewById(R.id.ivReserchPaper2);
        ivResearch3 = findViewById(R.id.ivReserchPaper3);
        ivResearch4 = findViewById(R.id.ivReserchPaper4);
        ivResearch5 = findViewById(R.id.ivReserchPaper5);
        ivResearch6 = findViewById(R.id.ivReserchPaper6);
        ivResearch7 = findViewById(R.id.ivReserchPaper7);
        ivResearch8 = findViewById(R.id.ivReserchPaper8);
        ivResearch9 = findViewById(R.id.ivReserchPaper9);

        ivResearch1.setImageResource(R.drawable.r1);
        ivResearch2.setImageResource(R.drawable.r2);
        ivResearch3.setImageResource(R.drawable.r3);
        ivResearch4.setImageResource(R.drawable.r4);
        ivResearch5.setImageResource(R.drawable.r5);
        ivResearch6.setImageResource(R.drawable.r6);
        ivResearch7.setImageResource(R.drawable.r7);
        ivResearch8.setImageResource(R.drawable.r8);
        ivResearch9.setImageResource(R.drawable.r9);

        mListResearchPaper = (ListView) findViewById(R.id.mListResearchPaper);
        Poetry adapter = new Poetry(getApplicationContext(), userName, userImage, userPost,
                userAbstractHeading, userAbstract);
        mListResearchPaper.setAdapter(adapter);
    }
}
