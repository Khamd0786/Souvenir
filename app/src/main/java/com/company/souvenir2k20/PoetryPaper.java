package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class PoetryPaper extends AppCompatActivity {

    private final int[] userImage = {
            R.drawable.the_dreamers,
            R.drawable.the_blight,
            R.drawable.the_nature


    };

    private final String[] userName = {
            "Utkarsh Tripathi",
            "Utkarsh Tripathi",
            "Utkarsh Tripathi"
    };

    private final String[] userPost = {
            "Chemical Engineering(Fianl year)",
            "Chemical Engg.(4th yr)",
            "Chem Engg. 4th year"

    };

    private final String[] userArticleHeading = {
            "THE DREAMERS",
            "THE BLIGHT",
            "THE NATURE"

    };

    private final String[] userArticle = {

            "The person who tries, may never fail\n" +
                    "The person who tries, are the person who fail\n" +
                    "The person who never tries can never fail because he can never succeed. \n" +
                    "Just a smile.\t\n" +
                    "Just a smile on face ,\n" +
                    "Can kill many illness.\n" +
                    "Just a smile on face,\n" +
                    "Can win many empathy.\n" +
                    "Just a smile on face,\n" +
                    "Can solve various issues.\n" +
                    "Just a smile on face,\n" +
                    "Can  be good for health.\n" +
                    "Just a smile on face,\n" +
                    "Conceals every cravenness.\n" +
                    "Just a smile on face,\n" +
                    "Can heal all the sorrows.\n" +
                    "Just a smile on that's enough.\n",




            "The bottom of the blight seems to be more caring for nature ,\n" +
                    "Not because it's not loyalty humanity,\n" +
                    "But because it's caring for humanity as well,\n" +
                    "As for the fact nobody in humanitarian region is caring for nature ,\n" +
                    "So blight is caring for it , and caring for humanity as well ,\n" +
                    "Be loyal to nature ,to have nature's loyalty.\n",


            "The rolling sky and ocean tries to show the reality of nature ,\n" +
                    "The man may however be careless for himself , but the nature is caring ,\n" +
                    "The man may however be selfish in nature, \n" +
                    "but the nature in selfless,\n" +
                    "The human may however cheat on each other but the nature is loyal,\n" +
                    "The human deceive themselves but the nature makes it believe ,\n" +
                    "Respect nature , it's loyalty it's sacrifice ,and it's care towards humanity.\n",



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poetry_activity);

        ListView mListAbResearchPaper = findViewById(R.id.mListAbResearchPaper);
         Poetry adapter = new Poetry(getApplicationContext(), userName, userImage, userPost, userArticleHeading,
                 userArticle);

         mListAbResearchPaper.setAdapter(adapter);
    }
}
