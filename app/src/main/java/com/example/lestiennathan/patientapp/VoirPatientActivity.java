package com.example.lestiennathan.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import static com.example.lestiennathan.patientapp.R.id.ListViewPatient;

public class VoirPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voir_patient);

        PatientAdapter adapterPatient =  new PatientAdapter(); // la base de donnée
        ListView ListViewVoirPatient = (ListView) findViewById(ListViewPatient);
        ListViewPatient.setAdapter(adapterPatient);

    }
}
