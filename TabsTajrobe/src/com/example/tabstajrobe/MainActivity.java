package com.example.tabstajrobe;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends FragmentActivity {
    // Fragment TabHost as mTabHost
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("تجارب من").setIndicator("تجارب من"),
            myExperTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("تجارب دیگران").setIndicator("تجارب دیگران"),
                othersExperTab.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("دوستان").setIndicator("دوستان"),
                friendsTab.class, null);

    }
}