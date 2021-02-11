package com.company;

public class AddressEntry {
    private String firstname;
    private String lastname;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String telephone;
    private String email;


    //generating constructor
    AddressEntry (String firstname, String lastname, String street, String city, String state, int zip, String email, String telephone){
        super();
        this.firstname=firstname;
        this.lastname=lastname;
        this.street=street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.telephone = telephone;
    }


    //generating setters and getters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "AddressEntry{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

//    AddressEntry(){
//        firstname = " ";
//        lastname = " ";
//        street = " ";
//        city = " ";
//        state = " ";
//        zip = 00001;
//        email = " ";
//        telephone = " ";
//    }

}
