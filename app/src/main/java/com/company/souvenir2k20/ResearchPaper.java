package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ResearchPaper extends AppCompatActivity {

    ListView mListResearchPaper;

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
        setContentView(R.layout.activity_research_paper);

        mListResearchPaper = (ListView) findViewById(R.id.mListResearchPaper);
        AbstractResearchPaperAdapter adapter = new AbstractResearchPaperAdapter(getApplicationContext(), userName, userImage, userPost,
                userAbstractHeading, userAbstract);
        mListResearchPaper.setAdapter(adapter);
    }
}
