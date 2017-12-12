package com.example.lestiennathan.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Patient monPatient = (Patient) getIntent().getSerializableExtra("Patient : ");

        TextView textDetail;
        TextView TextViewNomDetail = (TextView) findViewById(R.id.TextViewNomDetail);
        TextViewNomDetail.setText(monPatient.toString());

        TextView textDetailEspece;
        TextView textViewEspeceDetail = (TextView) findViewById(R.id.textViewEspeceDetail);
        textViewEspeceDetail.setText(monPatient.toString());

        TextView textDetailAge;
        TextView textViewAgeDetail = (TextView) findViewById(R.id.textViewAgeDetail);
        textViewAgeDetail.setText(monPatient.toString());

        TextView textDetailStatut;
        TextView textViewStatutDetail = (TextView) findViewById(R.id.textViewStatutDetail);
        textViewStatutDetail.setText(monPatient.toString());
    }
}