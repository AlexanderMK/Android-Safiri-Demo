package com.navdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private static int TAB_COUNT = 3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return PickupFragment.newInstance();
            case 1:
                return LorryFragment.newInstance();
            case 2:
                return SettingsFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return PickupFragment.TITLE;

            case 1:
                return LorryFragment.TITLE;

            case 2:
                return SettingsFragment.TITLE;
        }
        return super.getPageTitle(position);
    }
}
