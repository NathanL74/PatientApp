package com.example.lestiennathan.patientapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by la.xavier on 06/12/2017.
 */
public class PatientAdapter extends ArrayAdapter<Patient> {

    public PatientAdapter(Activity context, ArrayList<Patient> lesMots)
    {
        super(context, 0, lesMots);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View ListItemView = convertView;
        if(ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_patient, parent, false);

        }
        Patient currentPatient = getItem(position);

        TextView TextViewNom = (TextView) ListItemView.findViewById(R.id.Nom) ;
        TextViewNom.setText(currentPatient.get_nom());

        TextView textViewPnom = (TextView) ListItemView.findViewById(R.id.Prenom) ;
        textViewPnom.setText(currentPatient.get_prenom());




        return ListItemView;
    }
}
