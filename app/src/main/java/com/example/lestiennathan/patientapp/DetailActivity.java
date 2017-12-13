package com.example.lestiennathan.patientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button boutonSuppr = (Button) findViewById(R.id.ButtonSupprimer);

        Patient monPatient = (Patient) getIntent().getSerializableExtra("Patient : ");

        TextView textDetail;
        TextView TextViewNomDetail = (TextView) findViewById(R.id.TextViewNomDetail);
        TextViewNomDetail.setText(monPatient.get_nom());

        TextView textDetailPrenom;
        TextView textViewPrenomDetail = (TextView) findViewById(R.id.TextViewPrenomDetail);
        textViewPrenomDetail.setText(monPatient.get_prenom());

        TextView textAge;
        TextView TextViewAgeDetail = (TextView) findViewById(R.id.TextViewAgeDetail);
        TextViewAgeDetail.setText(monPatient.get_age());

        TextView textDetailChambre;
        TextView TextViewNumChambreDetail = (TextView) findViewById(R.id.TextViewNumChambreDetail);
        TextViewNumChambreDetail.setText(monPatient.get_chambre());

        TextView textDetailMotif;
        TextView TextViewMotifDetail = (TextView) findViewById(R.id.TextViewMotifDetail);
        TextViewMotifDetail.setText(monPatient.get_motif());

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Motifs,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spin = (Spinner) findViewById(R.id.SpinnerMotif);

        spin.setAdapter(adapter);



    }
}
