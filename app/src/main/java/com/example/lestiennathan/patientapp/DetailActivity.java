package com.example.lestiennathan.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private Patient monPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button boutonSuppr = (Button) findViewById(R.id.ButtonSupprimer);

        monPatient = (Patient) getIntent().getSerializableExtra("Patient : ");

        EditText textDetail;
        EditText TextViewNomDetail = (EditText) findViewById(R.id.TextViewNomDetail);
        TextViewNomDetail.setText(monPatient.get_nom());

        EditText textDetailPrenom;
        EditText textViewPrenomDetail = (EditText) findViewById(R.id.TextViewPrenomDetail);
        textViewPrenomDetail.setText(monPatient.get_prenom());

        EditText textAge;
        EditText TextViewAgeDetail = (EditText) findViewById(R.id.TextViewAgeDetail);
        TextViewAgeDetail.setText(monPatient.get_age());

        EditText textDetailChambre;
        EditText TextViewNumChambreDetail = (EditText) findViewById(R.id.TextViewNumChambreDetail);
        TextViewNumChambreDetail.setText(monPatient.get_chambre());

        EditText textDetailMotif;
        EditText TextViewMotifDetail = (EditText) findViewById(R.id.TextViewMotifDetail);
        TextViewMotifDetail.setText(monPatient.get_motif());

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Motifs,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spin = (Spinner) findViewById(R.id.SpinnerMotif);

        spin.setAdapter(adapter);

        Button buttonSupprimer = (Button) findViewById(R.id.ButtonSupprimer);
        buttonSupprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // monPatient.delete(Patient.class);
                Patient.delete(monPatient);

                Patient patientBDD =  Patient.last(Patient.class);
                Toast.makeText(DetailActivity.this, "Patient supprimé = " + patientBDD.get_nom(), Toast.LENGTH_SHORT).show();

            }
        });



    }
}


