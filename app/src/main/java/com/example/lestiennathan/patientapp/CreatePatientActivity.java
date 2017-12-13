package com.example.lestiennathan.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

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
                Spinner SpinnerMotif = (Spinner) findViewById(R.id.SpinnerMotif);

                //Patient patient = new Patient(editTextNom.toString(),editTextPrenom.toString(),editTextAge.toString(),editTextChambre.toString(),SpinnerMotif.toString());
                Patient patient = new Patient("test2","Nathan","12","20","Sans");
                //Patient.deleteAll(Patient.class);
                patient.save();

            }
        });


    }
}
