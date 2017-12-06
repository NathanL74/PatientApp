package com.example.lestiennathan.patientapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textviewVoirPatient = (TextView) findViewById(R.id.textview_VoirPatient);
        TextView textviewCreerPatient = (TextView) findViewById(R.id.textview_CreerPatient);

        textviewVoirPatient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentVoirPatient = new Intent(MainActivity.this, ViewPatientActivity.class);
                startActivity(intentVoirPatient);
            }
        });

        textviewCreerPatient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentCreerPatient = new Intent(MainActivity.this, CreatePatientActivity.class);
                startActivity(intentCreerPatient);
            }
        });
    }
}
