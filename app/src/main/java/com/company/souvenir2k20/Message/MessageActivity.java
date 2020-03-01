package com.company.souvenir2k20.Message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.company.souvenir2k20.R;

public class MessageActivity extends AppCompatActivity {

    ListView mListView;



    String[] messageName = {"Sanjeev S. Thakur",
            "P. K. Gupta",
            "Y. K. GUPTA",
            "Dr. Shailendra Singh",
            "Dr. Kashmira Gohil"};
    String[] messagePost = {"Chief Editor",
            "Chairman-SGI",
            "Vice Chairman-SGI",
            "Director AECTC",
            "Dean, Anand College of pharmacy, SGI"};
    String[] messageHeading = {"From the Editor’s Desk",
            "\"WINNING ISN'T EVERYTHING, PARTICIPATING IS TO\"",
            "The 19th cerebrum is a much awaited annual techno-fest",
            "Life is a beauty, admire it",
            "This big annual event \"Cerebrum\"  in Anand campus"};

    String[] messageDetail = {"“THE PURPOSE OF LIFE, AFTER ALL, IS TO LIVE IT, TO TASTE EXPERIENCE TO THE UTMOST, TO REACH OUT EAGERLY AND WITHOUT FEAR FOR NEWER AND RICHER EXPERIENCE’’\n" +
            "Anand Engineering College leaves no stone unturned to groom its students in their professional career.\n" +
            "The ‘’CEREBRUM’’ is a National level annual techno-cultural fest of ANAND ENGINEERING COLLEGE, which provides a platform to the students to exhibit their talent in different areas so that their ideas should be conceived, nurtured and given a physical shape. Keeping this in mind the 19th edition of souvenir is being released. A number of students from different departments are participating in this event. The souvenir is like a mirror showing the images of animated demonstration of memories, thoughts and creativity of every member connected with it.\n" +
            "While giving it shape the souvenir committee made every possible effort of excellence and endeavors to feel readers a new era of writing.\n" +
            "CEREBRUM provides a launch pad for those who have the potential to thrive ahead. The souvenir is divided into various sections like technical, cultural, sports and much more to explore. The new avatar of souvenir has new features and flavors.\n" +
            "\n" +
            "This year, the theme of CEREBRUM 2K19 is ‘’ANANT PARAKRAM” signifying the exploration of inner strength. Souvenir depicts this message throughout from the cover page to the last page in many ways. I wholeheartedly appreciate the efforts put in by the team who made the idea work out and in bringing it out successfully.\n" +
            "I convey my gratitude and best wishes to all the students and faculties on this occasion. I bestow my blessings to keep striving for such excellence and keep progressing in your career and life.",


            "\"WINNING ISN'T EVERYTHING, PARTICIPATING IS TO\"\n" +
                    "I am delighted to hear that Anand Engineering College is going to hold its 19th Annual Fest CEREBRUM on 15th and 16th of March 2019.\n" +
                    "Cerebrum is envisioned as best techno-cultural and unique fest to bring out the talent and to explore the same in the budding students. This is going to be a mega 2- days fun filled techno-cultural fest. The objective of the fest is to promote youth culture, expand networking opportunities and to provide a platform for exchange of creative of creative ideas.\n" +
                    "Each issue of our \"SOUVENIR\" is a milestone that marks our growth, unfolds our imagination and gives life to our thoughts and aspirations. As an academic institution, we all Anandians are indulged in regulating the energy of youngsters and establishing in an appropriate manner to strengthen their skills.\n" +
                    "I express my deep and sincere gratitude to whole Anandian family for their continuous support and guidance in whole journey of Anand Engineering College till now.\n" +
                    "May god lead the journey of this family continue to progress. WITH BEST WISHES\n",


            "It gives me immense pleasure to know that our Anand Engineering College of Agra is not only encouraging students to excel academically but also motivating them to harness their creativity by providing them a platform to exhibit their talent through the annual college fest \"CEREBRUM-19\".\n" +
                    "The 19th cerebrum is a much awaited annual techno-fest. It's always a very proud moment in the life of the institution to celebrate such occasion at a grand level. This fest will inculcate students to show their academic and technical talent. this fest will extend every opportunity to its participants to sharpen their skills in technical education, model representation as well as will bless them with a chance to give physical shape for innovative and creative ideas.\n" +
                    "Each year this fest is celebrated with a new theme to certify its students with new hope, ideas, emotions and dedication. Like every year, this year the theme of the techno-fest is \"ANANT PARAKRAM\" signifying to explore the inner strength.\n" +
                    "I am greatly obliged and thankful to all the members, staff and teachers of the institution for their support and efforts in developing such grand fest.\n" +
                    "I wish great success for CEREBRUM-19 of Anand Engineering College.\n",


            "Life is a beauty, admire it, Life is a dream, realize it.\n" +
                    "Life is a duty, complete it, Life is a game, play it.\n" +
                    "Life is a struggle, accept it, Life is a challenge, meet it.\n" +
                    "Life is sorrow overcome it, Life is luck, make it.\n" +
                    "Cerebrum 2K19, the Techno-Cultural Fest at AECTC is an integral part of all Anandians. Here, students display their hidden capabilities through participation in various event like, paper presentation, Drama, Singing, Dancing etc. Basically this event is ‘of the students’ ‘for the students’ and is ‘by the students’, which in-calculates the Time Management, Creativity and Leadership qualities. This Cerebrum-2019 is on a vary topical mantra, “ANANT PARAKRAM”, which is dedicated to Pulwama Shaheed Soldiers.\n" +
                    "On the occasion of Cerebrum2K19, I welcome all the guests, participants from other prestigious Institutions & dignitaries for encouraging our students. I am sure, all the Anandians will cherish & enjoy the memory of Cerebrum2K19.\n",


            "'My Best Wishes for this big annual event \"Cerebrum\"  in Anand campus, which provides the students an opportunity and equal platform to showcase their talents . Our students and staff of Anand College of Pharmacy have always been participating in various events in campus, lively and actively with much enthusiasm even in getting the sponsorship for the event. I hope, everyone enjoy the program with the same joy, spirit, equality & equanimity that event of this caliber demands'"


    };
    int[] messageUserImage = {R.drawable.sanjeevsir,
        R.drawable.pkgupta,
        R.drawable.ykgupta,
        R.drawable.shailendrasingh,
        R.drawable.drkashmiragohil };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        mListView = findViewById(R.id.mMessageListView);

        MessageAdapter messageAdapter = new MessageAdapter(getApplicationContext(), messageName, messageUserImage, messagePost, messageHeading);
        mListView.setAdapter(messageAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), MessageDetailActivity.class);
                intent.putExtra("messageName", messageName[position]);
                intent.putExtra("messagePost", messagePost[position]);
                intent.putExtra("messageHeading", messageHeading[position]);
                intent.putExtra("messageUserImage", messageUserImage[position]);
                intent.putExtra("messageDetail", messageDetail[position]);
                startActivity(intent);
            }
        });
    }
}
