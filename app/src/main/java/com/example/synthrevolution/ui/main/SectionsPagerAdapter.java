package com.example.synthrevolution.ui.main;

import android.content.Context;
import android.view.MotionEvent;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.synthrevolution.R;
import com.example.synthrevolution.synthTab1;
import com.example.synthrevolution.synthTab2;
import com.example.synthrevolution.synthTab3;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;


        switch (position){

            case 0:

                fragment = new synthTab1();
                break;

            case 1:

                fragment = new synthTab2();
                break;

            case 2:

                fragment = new synthTab3();
                break;
        }
        return fragment;
    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Display the amount of tabs
        return 3;
    }
}