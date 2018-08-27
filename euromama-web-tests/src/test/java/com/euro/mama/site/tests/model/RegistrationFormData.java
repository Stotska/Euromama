package com.euro.mama.site.tests.model;

public class RegistrationFormData {
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String telephone;
    private final String address;
    private final String city;
    private final String password;
    private final String confirmpassword;

    public RegistrationFormData(String firstname, String lastname, String email, String telephone, String address, String city, String password, String confirmpassword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.city = city;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }
}
