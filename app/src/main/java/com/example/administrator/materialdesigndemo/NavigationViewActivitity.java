package com.example.administrator.materialdesigndemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/20.
 */

public class NavigationViewActivitity extends AppCompatActivity {
    private TextView mTextView;
    private ImageView mImageView;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private CoordinatorLayout mCoordinatorLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_view);
        innts();
    }

    private void innts() {
        mImageView= (ImageView) findViewById(R.id.imgopen);
        mDrawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView= (NavigationView) findViewById(R.id.navigation_view);
        mCoordinatorLayout= (CoordinatorLayout) findViewById(R.id.main_content);
        mTextView= (TextView) findViewById(R.id.textview);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(Gravity.START);
            }
        });
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                case R.id.navigation_item_home:
                    Toast.makeText(NavigationViewActivitity.this,"首页",Toast.LENGTH_SHORT).show();
                    mDrawerLayout.closeDrawers();
                    break;
                case R.id.navigation_item_blog:
                    Toast.makeText(NavigationViewActivitity.this,"我的博客",Toast.LENGTH_SHORT).show();
                    mDrawerLayout.closeDrawers();
                    break;
                case R.id.navigation_item_about:
                    Toast.makeText(NavigationViewActivitity.this,"关于",Toast.LENGTH_SHORT).show();
                    mDrawerLayout.closeDrawers();
                    break;
                default:
                    break;
            }
                item.setChecked(true);
                mDrawerLayout.closeDrawer(Gravity.LEFT);

                return false;
            }
        });
    }
}
