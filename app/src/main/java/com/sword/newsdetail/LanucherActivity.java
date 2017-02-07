package com.sword.newsdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sword.newsdetail.view.R;

/**
 * Author: lwh
 * Date: 2/6/17 16:40.
 */

public class LanucherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancher);
    }

    public void onDetail(View view){
        Intent intent = new Intent();
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
    }
}
