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
public class Tab2 extends Fragment {




    public Tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

         ListView mListViewFaculty;
         mListViewFaculty = view.findViewById(R.id.mListFacultyBoard);

         final int[] facultyPhoto = {R.drawable.souvenir};
         final String[] facultyName = {"name"};
         final String[] facultyPost = {"Post"};
         final String[] facultySouvenirDuty = {"Duty"};


        MessageAdapter mAdapter = new MessageAdapter(getActivity().getBaseContext(), facultyName, facultyPhoto, facultyPost, facultySouvenirDuty);
        mListViewFaculty.setAdapter(mAdapter);


        return view;


    }

}
