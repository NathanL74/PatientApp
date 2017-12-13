package com.example.lestiennathan.patientapp;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

/**
 * Created by leclercq.sylvain on 06/12/2017.
 */

public class Patient extends SugarRecord {

    String _nom;
    String _prenom;
    String _chambre;
    String _motif;
    String _age;

    public Patient(){
    }

    public Patient(String unNom, String unPrenom, String uneChambre, String unAge, String unMotif)
    {
        _nom = unNom;
        _prenom = unPrenom;
        _chambre = uneChambre;
        _motif = unMotif;
        _age = unAge;
    }


    public String get_nom() {
        return _nom;
    }

    public String get_prenom() {
        return _prenom;
    }

    public String get_age() {
        return _age;
    }

    public String get_chambre() {
        return _chambre;
    }

    public String get_motif() {
        return _motif;
    }
}
