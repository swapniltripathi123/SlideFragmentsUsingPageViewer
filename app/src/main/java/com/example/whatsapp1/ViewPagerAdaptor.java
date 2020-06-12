package com.example.whatsapp1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class ViewPagerAdaptor extends FragmentPagerAdapter {
    int NoOftabs;


    public ViewPagerAdaptor(FragmentManager fm, int Numoftabs) {
        super(fm);
        this.NoOftabs=Numoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {

            ChatFragment tab1 = new ChatFragment();
            return tab1;
        }
        if (position == 2) {
            StatusFragment tab2 = new StatusFragment();
            return tab2;
        } else {
            CallFragment tab3 = new CallFragment();
            return tab3;
        }

    }

    @Override
    public int getCount()
    {
        return NoOftabs;
    }
}
