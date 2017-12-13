package com.example.lestiennathan.patientapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

import static com.example.lestiennathan.patientapp.R.id.ListViewPatient;

public class VoirPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voir_patient);

        ArrayList<Patient> lesPatients = new ArrayList<Patient>();
        lesPatients.add(new Patient("LA", "Xavier","C012","12","Fracture"));
        PatientAdapter adapterPatient =  new PatientAdapter(this,lesPatients ); // la base de donnée
        ListView ListViewVoirPatient = (ListView) findViewById(ListViewPatient);
        ListViewVoirPatient.setAdapter(adapterPatient);

        ListViewVoirPatient.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Patient monPatient;
                monPatient = (Patient) parent.getItemAtPosition(position);
                Intent i = new Intent(VoirPatientActivity.this, DetailActivity.class);
                i.putExtra("Patient : ", (Serializable) monPatient);
                startActivity(i);
            }
        });

    }
}
