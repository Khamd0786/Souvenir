package com.company.souvenir2k20.Tab;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.company.souvenir2k20.AbstractModelPresentation;
import com.company.souvenir2k20.AbstractResearchPaper;
import com.company.souvenir2k20.AnandCollege.AnandEngineeringCollege;
import com.company.souvenir2k20.EventBanner.EventBannerActivity;
import com.company.souvenir2k20.Message.MessageActivity;
import com.company.souvenir2k20.MyAdapter;
import com.company.souvenir2k20.ProgramSchedule;
import com.company.souvenir2k20.R;
import com.company.souvenir2k20.ResearchPaper;
import com.company.souvenir2k20.TechnicalArticle;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1 extends Fragment {




    public Tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        ListView mListView = view.findViewById(R.id.list);
        final String[] contentName = {"Messages", "Program Schedule", "Anand Engineering College", "Event Banner", "Abstract (Research Paper)",
        "Abstract (Model Presentation)", "Research Paper", "Technical Articles", "Programme Committee"};
//        final String[] countryDetail = {"indian is a very good country all religion has been followed in india "};
//        final int[] countryFlags = {R.drawable.india, R.drawable.us, R.drawable.shrilanka, R.drawable.turkey, R.drawable.brazil };

//        mListView = view.findViewById(R.id.mListView);

        MyAdapter myAdapter = new MyAdapter(getActivity().getBaseContext(), contentName);
        mListView.setAdapter(myAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(getActivity().getBaseContext(), MessageActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity().getBaseContext(), ProgramSchedule.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity().getBaseContext(), AnandEngineeringCollege.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity().getBaseContext(), EventBannerActivity.class);
                        startActivity(intent3);
                    case 4:
                        Intent intent4 = new Intent(getActivity().getBaseContext(), AbstractResearchPaper.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity().getBaseContext(), AbstractModelPresentation.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity().getBaseContext(), ResearchPaper.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity().getBaseContext(), TechnicalArticle.class);
                        startActivity(intent7);
                        break;
                }
            }
        });

        return view;


    }

}
