package com.syntacticsugar.linc.activity;

import com.syntacticsugar.linc.R;
import com.syntacticsugar.linc.R.layout;
import com.syntacticsugar.linc.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BasicInfo extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_basic_info, menu);
        return true;
    }
}
