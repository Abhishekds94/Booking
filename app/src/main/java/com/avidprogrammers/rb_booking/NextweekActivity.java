package com.avidprogrammers.rb_booking;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Abhishek on 01-Jun-17.
 */

public class NextweekActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextweek);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#c85a54")));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //spinner-start
        Spinner spin = (Spinner) findViewById(R.id.nextweek_city);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Class);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        //spinner-end

    }

    //BackButton in title bar
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    //Spinner
    String[] Class={"BANGALORE","HYDERABAD","TRIVANDRUM","ANDAMAN NICOBAR","PONDICHERRY","VIJAYAWADA","COORG","MYSORE","MANGALORE","CHIKMAGALUR"};

    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), Class[position], Toast.LENGTH_LONG);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }



}