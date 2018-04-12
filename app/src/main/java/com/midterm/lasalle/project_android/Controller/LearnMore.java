package com.midterm.lasalle.project_android.Controller;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.midterm.lasalle.project_android.R;

/**
 * Created by Shafi on 2018-04-11.
 */

public class LearnMore extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_learn_more);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width* .8) ,(int)(height* .6));
    }
}
