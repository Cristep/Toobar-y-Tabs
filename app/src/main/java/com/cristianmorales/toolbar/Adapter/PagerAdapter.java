package com.cristianmorales.toolbar.Adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.cristianmorales.toolbar.fragments.FirstFragment;
import com.cristianmorales.toolbar.fragments.SecondFragment;
import com.cristianmorales.toolbar.fragments.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;


    public PagerAdapter(@NonNull FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;


    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();

            case 1:
                return new SecondFragment();

            case 2:
                return new ThirdFragment();

            default:
                return null;
         }



    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
