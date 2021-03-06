package com.company.souvenir2k20.Tab;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.company.souvenir2k20.Message.MessageAdapter;
import com.company.souvenir2k20.R;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3 extends Fragment {




    public Tab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        ListView mListView = view.findViewById(R.id.mListStudentBoard);

        final int[] studentVolunteerPhoto = {R.drawable.nikhil_gaurav,
                R.drawable.jyoti_singh,
                R.drawable.hammad_khan,
                R.drawable.rishabh_raj,
                R.drawable.prabhat_rajpoot,
                R.drawable.souvenirlogo,
                R.drawable.akhilesh_kumar,
                R.drawable.muddassir_rafique,
                R.drawable.kaushiki_khare,
                R.drawable.vanshika_sandhooja,
                R.drawable.nitika_garg,
                R.drawable.arpit,
                R.drawable.harshita,
                R.drawable.pratiyush_kumar,
                R.drawable.somya_sharma,
                R.drawable.shazia_khan,
                R.drawable.soha_khan,
                R.drawable.vishnu_gupta,
                R.drawable.shivank_agarwal,
                R.drawable.ayushi_pathak,
                R.drawable.shivani_gupta,
                R.drawable.achanchi_singh,
                R.drawable.souvenirlogo,
                R.drawable.vishal_sharma,
                R.drawable.ayushi_garg,
                R.drawable.ayush_kumar_singh,
                R.drawable.ayush_gupta,
                R.drawable.aditi_rai,
                R.drawable.akhilesh_gupta,
                R.drawable.preeti_tiwari,
                R.drawable.bhagirath_jha,
                R.drawable.ashwani,
                R.drawable.bhagirathfinal,
                R.drawable.vikas_singh,

        };


        final String[] studentVolunteerName = {"Nikhil Gaurav",
                "Jyoti Singh",
                "Hammad Khan",
                "Rishabh Raj",
                "Prabhat Rajput",
                "Sukrati P. Singh",
                "Akhilesh Kumar",
                "Mudassir Rafique",
                "Kaushiki Khare",
                "Vanshika Sandooja",
                "Nitika Garg",
                "Arpit Gupta",
                "Harshita Varmani",
                "Pratyush Kumar",
                "Somya Sharma",
                "Shazia khan",
                "Soha Khan",
                "Vishnu Gupta",
                "Shivank Agarwal",
                "Ayushi Pathak",
                "Shivani Gupta",
                "Achanshi Singh",
                "Rishika Rathore",
                "Vishal Sharma",
                "Ayushi Garg",
                "Ayush Kumar Singh",
                "Ayush Gupta",
                "Aditi Rai",
                "Abishek Gupta",
                "Preeti Tiwari",
                "Vinayak Ranjan",
                "Ashwani Pratap Singh",
                "Bhagirath Jha",
                "Vikash Singh",





        };


        final String[] studentVolunteerPost = {"Chemical (Final year)",
                "ECE (Final year)",
                "BBA (Second year)",
                "CSE (First year)",
                "BBA (Second year)",
                "Civil (Second year)",
                "Civil (Fourth year)",
                "ME (Third year)",
                "CSE (Third year)",
                "BBA (Second year)",
                "BBA (Second year)",
                "BBA (Second year)",
                "BBA (Second year)",
                "ME (Third Year)",
                "BT (Third year)",
                "MBA (First year)",
                "MBA (First year)",
                "BBA (Second year)",
                "BBA (Second year)",
                "BBA (Second year)",
                "BBA (Second year)",
                "BBA (Second year)",
                "BBA (First year)",
                "BBA (First year)",
                "BBA (First year)",
                "CSE (Second year)",
                "CSE (Second year)",
                "BT (Second year)",
                "CSE (Second year)",
                "B.Pharm (Third year)",
                "BioTech (First year)",
                "CSE (Second year)",
                "CSE (First year)",
                "CSE (Second year)",





        };


        final String[] studentVolunteerSouvenirPost = {"Coordinator",
                "Coordinator",
                "Coordinater, Application Developer",
                "Designer",
                "Designer",
                "Flavours, Technical/Non-Technical Articles",
                "Certificate committee, Technical/Non-Technical Articles",
                "Certificate committee, Technical/Non-Technical Articles",
                "Compilation",
                "Flavours",
                "Flavours",
                "Flavours",
                "Technical/Non-Technical Articles",
                "Compilation",
                "Compilation",
                "Messages Collection",
                "Messages Collection",
                "Poster Collection, Student Committee",
                "Student Committee, Technical/Non-Technical Articles",
                "Compilation",
                "Compilation",
                "Compilation, Technical/Non-Technical Articles",
                "Technical/Non-Technical Articles",
                "Cerebrum Working, Schedule",
                "Cerebrum Working, Schedule",
                "Photo Collection, Technical/Non-Technical Articles",
                "Photo Collection, Technical/Non-Technical Articles",
                "Photo Collection, Technical/Non-Technical Articles",
                "Technical/Non-Technical Articles",
                "Compilation",
                "Designer",
                "Designer",
                "Designer",
                "Designer",





        };



        MessageAdapter myAdapter = new MessageAdapter(Objects.requireNonNull(getActivity()).getBaseContext(), studentVolunteerName, studentVolunteerPhoto, studentVolunteerPost, studentVolunteerSouvenirPost);
        mListView.setAdapter(myAdapter);



        return view;


    }

}
