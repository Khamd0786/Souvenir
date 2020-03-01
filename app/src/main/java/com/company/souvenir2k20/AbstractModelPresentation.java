package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class AbstractModelPresentation extends AppCompatActivity {

    ListView mListModelPresentation;


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
        setContentView(R.layout.activity_abstract_model_presentation);

        mListModelPresentation = findViewById(R.id.mListModelPresentation);
        AbstractResearchPaperAdapter adapter = new AbstractResearchPaperAdapter(getApplicationContext(), userName, userImage, userPost,
                userAbstractHeading, userAbstract);
        mListModelPresentation.setAdapter(adapter);


    }
}
