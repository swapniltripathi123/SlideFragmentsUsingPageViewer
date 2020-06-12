package com.example.whatsapp1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements CallFragment.OnFragmentInteractionListener,ChatFragment.OnFragmentInteractionListener,StatusFragment.OnFragmentInteractionListener {
    private Toolbar toolbar;
    private TabLayout tablayout;
    private ViewPager viewPager;
    private SearchView searchView;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        tablayout.addTab(tablayout.newTab().setText("Chats"));
        tablayout.addTab(tablayout.newTab().setText("Calls"));
        tablayout.addTab(tablayout.newTab().setText("Status "));
        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = findViewById(R.id.viewPager);
        final ViewPagerAdaptor adapter = new ViewPagerAdaptor(getSupportFragmentManager(), tablayout.getTabCount());

        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {


            }

        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}



