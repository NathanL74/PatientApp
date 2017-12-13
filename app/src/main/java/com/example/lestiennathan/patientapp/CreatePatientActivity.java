package com.example.lestiennathan.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.orm.SugarRecord;

public class CreatePatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_patient);


        Button buttonInscrire = (Button) findViewById(R.id.buttonInscrire);
        buttonInscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNom = (EditText) findViewById(R.id.editTextNom);
                EditText editTextPrenom = (EditText) findViewById(R.id.editTextPrenom);
                EditText editTextAge = (EditText) findViewById(R.id.editTextAge);
                EditText editTextChambre = (EditText) findViewById(R.id.editTextChambre);
                EditText editTextMotif = (EditText) findViewById(R.id.editTextMotif);

                Patient patient = new Patient(""+ editTextNom.getText().toString(),"" +editTextPrenom.getText().toString(), ""+editTextAge.getText().toString(), ""+editTextChambre.getText().toString(), ""+editTextMotif.getText().toString());
                //Patient.deleteAll(Patient.class);
                patient.save();

                Patient patientBDD =  Patient.last(Patient.class);

                Toast.makeText(CreatePatientActivity.this, "patient bdd = " + patientBDD.get_nom(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
