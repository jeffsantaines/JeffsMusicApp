package com.example.jeffsantaines.jeffsmusicapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jeffsantaines on 3/12/17.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1){
            return new BrowseFragment();
        } else if (position == 2) {
            return new SearchFragment();
        } else if (position == 3) {
            return new RadioFragment();
        } else {
            return new LibraryFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
