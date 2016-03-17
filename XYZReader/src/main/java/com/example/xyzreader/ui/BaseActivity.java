package com.example.xyzreader.ui;

import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

import com.example.xyzreader.R;

/**
 * Created by squirrel on 3/16/16.
 */
public class BaseActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    public static final String PHOTOS_DETAIL_KEY = "PHOTO_DETAILS";
    public static final String LIST_KEY = "LIST";

    protected Toolbar getToolbar() {
        if (mToolbar == null) {
            mToolbar = (Toolbar) findViewById(R.id.app_toolbar);
            if (mToolbar != null) {
                setSupportActionBar(mToolbar);
            }
        }
        return mToolbar;
    }

    protected Toolbar activateToolbarWithHomeEnabled() {
        getToolbar();
        if (mToolbar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        return mToolbar;
    }
}
