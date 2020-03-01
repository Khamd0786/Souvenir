package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class AbstractResearchPaper extends AppCompatActivity {

    ListView mListAbResearchPaper;

    int[] userImage = {
        R.drawable.souvenir,
            R.drawable.anandengineeringcollege
    };

    String[] userName = {

            "Prakash Kumar*, Hari Govind, Avnish Kumar",
            "Pramod Gware"
    };

    String[] userPost = {

            "Department of Biotechnology",
            "Department of Biotechnology"

    };

    String[] userArticleHeading = {

            "Isolation and Characterization of Novel microbes for Chromium Bioremediation from Tannery Effluent",
            "Comparative Genome and Proteome Analysis Anopheles Gambiae and Drosophila Melanogaster"

    };

    String[] userArticle = {

            "Purpose: In India about 3,000 tanneries process 700,000 tons/year of hides and skins; it situated the banks of the rivers was found that maximum people were affected with chromium. Sukinda, Unnao, Agra etc. is top most polluted places in the world, they have alarming concentration of this carcinogenic heavy metal of 16.3 mg/l against the permissible concentration of 0.05 mg/l for drinking water and high concentration within sediments poses a major threat to the entire ecosystem. We tried bioremediation of tannery effluent by Nobel microbes, the microbes are reported very effective in it.\n" +
                    "Methods: it includes collection of effluent sample from tannery & characterization. The microbes isolated by routine microbial technique and evaluated its chromium removal efficiency. Microbes characterized for biochemically as per Bergey's Manual and studied for growth kinetic of acclimatized bacterial strain in tannery effluent and develop of microbial flora for treatment of tannery effluent. \n" +
                    "Results: Microbial bioremediation is an efficient tool due to its low cost, high efficiency and eco-friendly nature. Two chromate tolerant bacteria have been isolated employing different concentration 100-350 mg/l. Maximum tolerable Concentration of white pigment producing bacteria was found to be 850mg/L. They are Gram (+) Ve, Strepto-bacilli and positive for indole test, MR test, urease, H2S production, catalase and negative in VP test, Protease, citrate test. \n" +
                    "Conclusion: The present study indicates that the novel strains were able to grow in selective pressure of chromium. They could be used as a promising stain for remediate chromium from tannery effluent.\n" +
                    "Keywords: Bioremediation, Characterisation, MR-VP test- Methyl Red & Vogues-Prosumer Test\n"

            ,
            "The extent of similarity between Anopheles and Drosophila is approximately equal to that between human and pufferfish. The spread of infectious diseases among humans is mediated primarily by the world’s most dangerous animal. According to the World Health Organization, global climate change is expanding mosquitoes range, heightening the risk of disease for millions of additional people. Comparative genomics is a large-scale, holistic approach that compares two or more genomes to discover the similarities and differences between the genomes and to study the biology of the individual genomes. Comparative studies can be performed at different levels of the genomes to obtain multiple perspectives about the organisms."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_research_paper);

        mListAbResearchPaper = (ListView) findViewById(R.id.mListAbResearchPaper);
         AbstractResearchPaperAdapter adapter = new AbstractResearchPaperAdapter(getApplicationContext(), userName, userImage, userPost, userArticleHeading,
                 userArticle);

         mListAbResearchPaper.setAdapter(adapter);
    }
}
