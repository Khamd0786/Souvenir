package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class TechnicalArticle extends AppCompatActivity {

    private final int[] userImage = {
            R.drawable.anand_engineering_college
    };

    private final String[] userName ={
            "Name"
    };

    private final String[] userPost = {
            "post"
    };

    private final String[] userAbstractHeading = {
            "heading"
    };

    private final String[] userAbstract = {
            "abstract"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_article);

        ListView mListTechnicalArticle = findViewById(R.id.mListTechnicalArticle);

        Poetry adapter = new Poetry(getApplicationContext(), userName, userImage, userPost,
                userAbstractHeading, userAbstract);

        mListTechnicalArticle.setAdapter(adapter);
    }
}
