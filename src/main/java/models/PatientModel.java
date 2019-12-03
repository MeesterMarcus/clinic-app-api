package models;

import lombok.Data;

@Data
public class PatientModel {

    public PatientModel(Long id, String firstName, String lastName, String address, String city, String state,
                        String zip, String email, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
    }

    Long id;
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String email;
    String phone;
}
