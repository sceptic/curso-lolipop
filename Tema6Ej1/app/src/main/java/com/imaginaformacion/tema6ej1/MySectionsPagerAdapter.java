package com.imaginaformacion.tema6ej1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.Locale;

public class MySectionsPagerAdapter extends FragmentPagerAdapter {

    public MySectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PlaceholderFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Móvil".toUpperCase(l);
            case 1:
                return "Web".toUpperCase(l);
        }
        return null;
    }
}
