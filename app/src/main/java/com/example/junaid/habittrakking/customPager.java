package com.example.junaid.habittrakking;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Junaid on 10/23/2016.
 */

public class customPager extends FragmentPagerAdapter {
    public customPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new habitEntry();
            case 1:
                return new viewHabit();
            default:
                return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Habit Entry";
            case 1:
                return "View Habit";
            default:
                return null;
        }
    }
}
