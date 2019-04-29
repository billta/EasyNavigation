package com.example.billta.easynavigation.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.easynagivation.view.EasyNavigationBar;
import com.example.billta.easynavigation.R;
import com.example.billta.easynavigation.ui.normal.AFragment;
import com.example.billta.easynavigation.ui.normal.BFragment;
import com.example.billta.easynavigation.ui.normal.CFragment;
import com.example.billta.easynavigation.ui.normal.DFragment;


import java.util.ArrayList;
import java.util.List;

public class NormalActivity extends AppCompatActivity {

    private EasyNavigationBar navigationBar;

    private String[] tabText = {"首页", "发现", "消息", "我的"};
    //未选中icon
    private int[] normalIcon = {R.mipmap.index, R.mipmap.find, R.mipmap.message, R.mipmap.me};
    //选中时icon
    private int[] selectIcon = {R.mipmap.index1, R.mipmap.find1, R.mipmap.message1, R.mipmap.me1};

    private List<android.support.v4.app.Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noadd);

        navigationBar = findViewById(R.id.navigationBar);

        fragments.add(new AFragment());
        fragments.add(new BFragment());
        fragments.add(new CFragment());
        fragments.add(new DFragment());

        navigationBar.titleItems(tabText)
                .normalIconItems(normalIcon)
                .selectIconItems(selectIcon)
                .fragmentList(fragments)
                .fragmentManager(getSupportFragmentManager())
                .canScroll(true)
                .build();
    }

    public EasyNavigationBar getNavigationBar() {
        return navigationBar;
    }

}
