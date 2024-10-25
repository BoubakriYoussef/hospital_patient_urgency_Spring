package org.example.hopital.service;

import org.example.hopital.model.Patient;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.getUrgencyLevel(), p1.getUrgencyLevel());
    }
}
