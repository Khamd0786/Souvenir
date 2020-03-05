package com.company.souvenir2k20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PageAdapter pageAdapter;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        color = getColor(findViewById(R.color.colorPrimary))

        TabLayout mTabLayout = findViewById(R.id.tabLayout);
        TabItem tab1 = findViewById(R.id.Tab1);
        TabItem tab2 = findViewById(R.id.Tab2);
        TabItem tab3 = findViewById(R.id.Tab3);
        mViewPager = findViewById(R.id.viewpager);


        pageAdapter = new PageAdapter(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(pageAdapter);


        //noinspection deprecation
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pageAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 1) {


                    pageAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 2){

                    pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

    }
}
