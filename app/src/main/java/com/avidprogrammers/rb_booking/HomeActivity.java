package com.avidprogrammers.rb_booking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Abhishek on 01-Jun-17.
 */

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.layout_today).setOnClickListener(listener_layout_today);
        findViewById(R.id.layout_nextweek).setOnClickListener(listener_layout_nextweek);
        findViewById(R.id.layout_later).setOnClickListener(listener_layout_later);
        findViewById(R.id.layout_range).setOnClickListener(listener_layout_range);

    }

    View.OnClickListener listener_layout_today = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(HomeActivity.this, TodayActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener listener_layout_nextweek = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(HomeActivity.this, NextweekActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener listener_layout_later = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(HomeActivity.this, LaterActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener listener_layout_range = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(HomeActivity.this, RangeActivity.class);
            startActivity(intent);
        }
    };

}