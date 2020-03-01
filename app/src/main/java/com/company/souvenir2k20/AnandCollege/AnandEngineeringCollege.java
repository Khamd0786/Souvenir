package com.company.souvenir2k20.AnandCollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.company.souvenir2k20.R;

public class AnandEngineeringCollege extends AppCompatActivity {

    TextView tvAnand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anand_engineering_college);

        tvAnand = findViewById(R.id.tvAnand);

        tvAnand.setText(
                "Anand Engineering College Technical Campus was established in September 1998. This college comes under the SGEI (Sharda Group of Educational Institutes), a group started in the year 1995, by P.K. Gupta and Y.K. Gupta, after the name of their mother Sharda Devi. The college is situated at the 18km milestone on the Agra-Delhi Highway (NH-2) spread across 30 acres at a scenic location over Keetham Lake and housed in its own building with 500,000 sq. ft. (50,000 m2) of covered area, and the first students graduated in 2002.\n" +
                        " The college is establishing benchmarks in academic excellence and holistic grooming of students, to meet the career challenges in an increasingly globalized economic conditions – The educational trust earned a goodwill by delivering “Quality Education” in the field of Management, Engineering, Architecture and Pharmacy by adopting best practices and systems.\n" +
                        "Every year Anand Engineering College Technical Campus celebrates its annual techno- cultural fest “CEREBRUM” as a sea of extravaganza to present the brightest and absolute brains of the year.\n" +
                        "So in continuation of this tradition, this year i.e. 2K20, Anand College is organizing this event with the theme of “A BIG LEAP” \n"
        );


    }
}
