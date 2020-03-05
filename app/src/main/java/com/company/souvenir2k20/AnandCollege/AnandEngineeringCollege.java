package com.company.souvenir2k20.AnandCollege;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.company.souvenir2k20.R;

public class AnandEngineeringCollege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anand_engineering_college);

        TextView tvAnand = findViewById(R.id.tvAnand);
        ImageView imageView = findViewById(R.id.imageViewAnandEngineering);

//        imageView.setImageResource(R.drawable.anand_engineering_college);

        Glide.with(imageView).load(R.drawable.anand_engineering_college).apply(RequestOptions.centerCropTransform().centerCrop()).into(imageView);
        tvAnand.setText(
                "Anand Engineering College Technical Campus Founded in 1998. Over the last 20 years of its existence, the Institute has created a formidable reputation for itself. Anand fosters a culture of empowerment. it makes space for creativity and backs innovative and unconventional ideas.\n" +
                        "\n" +
                        "AEC has a dedicated Placement division, which operates throughout the year and invites leading brands from the corporate world to take part in the annual placement drive. 99% and above students are placed every year from computer science and other branches. Average and Highest salary offered to the AEC candidates are Rs. 3.4 Lakh per annum and Rs. 27 Lakh per annum respectively.\n" +
                        "\n" +
                        "Every year our college conduct 2 days annual fest cerebrum and they conducted so many \n" +
                        "technical events. The college conducted many sports events at the state level. They conducted so many literature events for students. In college, there are so many events organized.\n" +
                        "In college, every year, UP government provides a scholarship program for every student who is eligible for criteria. There is no need for an education loan.\n" +
                        "Strong values, commitment, positive attitude, grasp of fundamentals are the hallmark of our students. They integrate quickly with employer’s set up & commit themselves whole heartedly for making a career with the companies coming for placement drives.  Our alumni are, therefore, working in leading companies across INDIA and ABROAD serving as goodwill ambassadors for their Alma-Mater ensuring more such opportunities for their juniors.\n"
        );


    }
}
