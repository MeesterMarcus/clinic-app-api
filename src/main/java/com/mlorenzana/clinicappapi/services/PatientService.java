package com.mlorenzana.clinicappapi.services;


import org.springframework.stereotype.Service;
import com.mlorenzana.clinicappapi.models.PatientModel;

import java.util.ArrayList;
import java.util.List;


@Service
public class PatientService {

    public List<PatientModel> getPatients() {
        List<PatientModel> list = new ArrayList<>();
        list.add(new PatientModel(1L, "Jimmy", "Johnson", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Frank", "Johnson", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Tim", "Smith", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Val", "Romero", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Marcus", "Lorenzana", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Amy", "Smith", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Bill", "Clinton", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Donald", "Farts", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Jamie", "Ferrero", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Harry", "Davidson", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Michael", "Jordan", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        list.add(new PatientModel(1L, "Tim", "Duncan", "1234 Addr", "San Antonio", "TX", "78232", "jj@gmail.com", "2102867939"));
        return list;
    }

//    public ResponseEntity<?> addPatient() {
//
//    }
}
