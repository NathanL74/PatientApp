
package com.example.lestiennathan.patientapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;


public class ViewPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_view);

        ArrayList<Patient> _lesPatients = new ArrayList<Patient>();
        Iterator<Patient> listePatients = Patient.findAll(Patient.class);
        while(listePatients.hasNext()){
            Patient monPatient = listePatients.next();
            _lesPatients.add(monPatient);
        }

        PatientAdapter adapterPatient =  new PatientAdapter(this, _lesPatients ); // la base de donnée

        ListView ListViewVoirPatient = (ListView) findViewById(R.id.ListViewPatient);
        ListViewVoirPatient.setAdapter(adapterPatient);

        ListViewVoirPatient.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Patient monPatient;
                monPatient = (Patient) parent.getItemAtPosition(position);
                Intent i = new Intent(ViewPatientActivity.this, DetailActivity.class);
                i.putExtra("Patient : ", (Serializable) monPatient);
                startActivity(i);
            }
        });

    }
}