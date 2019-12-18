package com.example.dell.monikaoshi2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private ArrayList<View> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initView();
    }
    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        View view1 = LayoutInflater.from(this).inflate(R.layout.pager1, null);
        View view2 = LayoutInflater.from(this).inflate(R.layout.pager2, null);
        View view3 = LayoutInflater.from(this).inflate(R.layout.pager3, null);
        Button btw = view3.findViewById(R.id.btw);
        list = new ArrayList<>();
        list.add(view1);
        list.add(view2);
        list.add(view3);
        ViewPagerAdapter adapters = new ViewPagerAdapter(list);
        mViewPager.setAdapter(adapters);
        btw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewPagerActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
