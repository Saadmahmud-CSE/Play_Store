package com.example.playstoreapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AppsPagerAdapter extends FragmentPagerAdapter {

    public AppsPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentForYou();
            case 1:
                return new FragmentKids();
            default:
                return new FragmentForYou();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "For You";
            case 1:
                return "Kids";
            default:
                return "";
        }
    }
}
