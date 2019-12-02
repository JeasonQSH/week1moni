package com.bawei.week1.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.bawei.week1.R;
import com.bawei.week1.base.BaseActivity;
import com.bawei.week1.view.fragment.HomeFragment;
import com.bawei.week1.view.fragment.MyFragment;
import com.bawei.week1.view.fragment.NewsFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_home;
    }
}
