package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class TechnicalArticle extends AppCompatActivity {
    ListView mListTechnicalArticle;

    int[] userImage = {
            R.drawable.anandengineeringcollege
    };

    String[] userName ={
            "Name"
    };

    String[] userPost = {
            "post"
    };

    String[] userAbstractHeading = {
            "heading"
    };

    String[] userAbstract = {
            "abstract"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_article);

        mListTechnicalArticle = (ListView) findViewById(R.id.mListTechnicalArticle);

        Poetry adapter = new Poetry(getApplicationContext(), userName, userImage, userPost,
                userAbstractHeading, userAbstract);

        mListTechnicalArticle.setAdapter(adapter);
    }
}
