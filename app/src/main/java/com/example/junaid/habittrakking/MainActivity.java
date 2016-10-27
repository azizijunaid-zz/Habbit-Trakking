package com.example.junaid.habittrakking;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tl = (TabLayout) findViewById(R.id.TabL);
        ViewPager vp = (ViewPager) findViewById(R.id.viewPager);
        customPager obj = new customPager(getSupportFragmentManager());
        tl.setupWithViewPager(vp);
        vp.setAdapter(obj);
    }
}
