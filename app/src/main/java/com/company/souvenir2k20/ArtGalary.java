package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.company.souvenir2k20.EventBanner.EventAdapter;

public class ArtGalary extends AppCompatActivity {

    private final int[] artImage = {
            R.drawable.aanchal_chaurasiya_five,
            R.drawable.aanchal_chaurasia,
            R.drawable.aanchal_chaurasiya_sec,
            R.drawable.aanchal_chaurasiya_third,
            R.drawable.aanchal_chaurasiya_fourth,
            R.drawable.aman_kanaujiya,
            R.drawable.anmol_prashar,
            R.drawable.anmol_prashar_sec,
            R.drawable.anmol_prashar_third,
            R.drawable.divyanshi,
            R.drawable.divyanshi_sec,
            R.drawable.divyanshi_third,
            R.drawable.priyal_goyal,
            R.drawable.saba_akhtar,
            R.drawable.saba_akhtar_sec,
            R.drawable.saba_akhtar_third,
            R.drawable.saba_akhtar_fourth,
            R.drawable.tanishka_sharma,
            R.drawable.tanishka_sharma_ssec,
            R.drawable.vinita_goyal,
            R.drawable.vinita_goyal_sec,
            R.drawable.vinita_goyal_third

    };

    private final String[] artName = {
            "Aanchal Chaurasia",
            "Aanchal Chaurasia",
            "Aanchal Chaurasia",
            "Aanchal Chaurasia",
            "Aanchal Chaurasia",
            "Aman Kanaujiya",
            "Anmol Prashar",
            "Anmol Prashar",
            "Anmol Prashar",
            "Divyanshi",
            "Divyanshi",
            "Divyanshi",
            "Priyal Goyal",
            "Saba Akhtar",
            "Saba Akhtar",
            "Saba Akhtar",
            "Saba Akhtar",
            "Tanishka Sharma",
            "Tanishka Sharma",
            "Vinita Goyal",
            "Vinita Goyal",
            "Vinita Goyal"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.art_galary);

        ListView mListArtGalary = findViewById(R.id.mListArtGalary);

        EventAdapter adapter = new EventAdapter(this, artName, artImage);
        mListArtGalary.setAdapter(adapter);
    }
}
