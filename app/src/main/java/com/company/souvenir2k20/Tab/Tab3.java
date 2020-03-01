package com.company.souvenir2k20.Tab;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.company.souvenir2k20.Message.MessageAdapter;
import com.company.souvenir2k20.R;


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

        final int[] studentVolunteerPhoto = {R.drawable.anandengineeringcollege};
        final String[] studentVolunteerName = {"name"};
        final String[] studentVolunteerPost = {"post"};
        final String[] studentVolunteerSouvenirPost = {"duty"};


        MessageAdapter myAdapter = new MessageAdapter(getActivity().getBaseContext(), studentVolunteerName, studentVolunteerPhoto, studentVolunteerPost, studentVolunteerSouvenirPost);
        mListView.setAdapter(myAdapter);



        return view;


    }

}
