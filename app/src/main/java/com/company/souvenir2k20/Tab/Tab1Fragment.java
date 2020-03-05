package com.company.souvenir2k20.Tab;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.company.souvenir2k20.EnglishArticles;
import com.company.souvenir2k20.PoetryPaper;
import com.company.souvenir2k20.AnandCollege.AnandEngineeringCollege;
import com.company.souvenir2k20.EventBanner.EventBannerActivity;
import com.company.souvenir2k20.Message.MessageActivity;
import com.company.souvenir2k20.MyAdapter;
import com.company.souvenir2k20.ArtGalary;
import com.company.souvenir2k20.R;
import com.company.souvenir2k20.ResearchPaper;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
//file name me mention kr dia kro kya h like
public class Tab1Fragment extends Fragment {




    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        ListView mListView = view.findViewById(R.id.list);
        final String[] contentName = { "Anand Engineering College", "Messages", "Art Gallery", "Event Banner", "Poetry",
        "Articles", "Research Paper"};
//        final String[] countryDetail = {"indian is a very good country all religion has been followed in india "};
//        final int[] countryFlags = {R.drawable.india, R.drawable.us, R.drawable.shrilanka, R.drawable.turkey, R.drawable.brazil };

//        mListView = view.findViewById(R.id.mListView);
        MyAdapter myAdapter = new MyAdapter(Objects.requireNonNull(getActivity()).getBaseContext(), contentName);
        mListView.setAdapter(myAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent2 = new Intent(Objects.requireNonNull(getActivity()).getBaseContext(), AnandEngineeringCollege.class);
                        startActivity(intent2);
                        break;

                    case 1:
                        Intent intent = new Intent(Objects.requireNonNull(getActivity()).getBaseContext(), MessageActivity.class);
                        startActivity(intent);
                        break;

                    case 2:
                        Intent intent1 = new Intent(Objects.requireNonNull(getActivity()).getBaseContext(), ArtGalary.class);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Objects.requireNonNull(getActivity()).getBaseContext(), EventBannerActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Objects.requireNonNull(getActivity()).getBaseContext(), PoetryPaper.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Objects.requireNonNull(getActivity()).getBaseContext(), EnglishArticles.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(Objects.requireNonNull(getActivity()).getBaseContext(), ResearchPaper.class);
                        startActivity(intent6);
                        break;
                }
            }
        });

        return view;


    }

}

//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas

//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
//sdhdfajkhfkdshfjasfkasjfsfkshafsaf
//asdugfkjsdhfsafsgdfsahdfjdsfhsafsfasdfasfuas
