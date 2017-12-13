package com.example.lestiennathan.patientapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

    import java.io.Serializable;
import java.util.ArrayList;

/**
 - * Created by la.xavier on 12/12/2017.
 + * Created by ferreira.damien on 13/12/2017.
 */
public class ViewPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_patient);

        ArrayList<Patient> _lesPatients = new ArrayList<Patient>();
        _lesPatients.add(new Patient("LA", "Xavier", "C012", "12", "Fracture"));
        _lesPatients.add(new Patient("Lestien", "Nathan", "C015", "15", "sans"));
        _lesPatients.add(new Patient("leclerc", "Sylvain", "C018", "10", "tibiat"));
        _lesPatients.add(new Patient("Ferreira", "Damien", "C020", "16", "bras"));

        PatientAdapter adapterPatient = new PatientAdapter(this, _lesPatients); // la base de donnée

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