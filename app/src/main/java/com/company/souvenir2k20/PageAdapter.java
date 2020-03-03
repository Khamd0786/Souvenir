package com.company.souvenir2k20;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.company.souvenir2k20.Tab.Tab1Fragment;
import com.company.souvenir2k20.Tab.Tab2;
import com.company.souvenir2k20.Tab.Tab3;

public class PageAdapter extends FragmentPagerAdapter {

    private  int numberOfTabs;

    public PageAdapter(@NonNull FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            Tab1Fragment tab1 = new Tab1Fragment();
            return tab1;
        }
        if (position == 1){
            Tab2 tab2 = new Tab2();
            return tab2;
        } else {
            Tab3 tab3 = new Tab3();
            return tab3;
        }
//        switch (position){
//            case 0:
//                return new tab1();
//            case 2:
//                return new tab2();
//            case 3:
//                return new tab3();
//                default:
//                    return null;


    }




    @Override
    public int getCount() {
        return numberOfTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
