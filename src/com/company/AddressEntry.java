//AddressEntry - this class represents a single Address/Contact information entry in the AddressBook
//        It should contain contructors, at least one constructor…one that accepts a first, last name, street, city, state, zip, email, phone.
//        contain separate class varaibles representing all the information in an AddressEntry contact.
//        It should cotain a toString() method that returns a nicely formats a string containing all contact information for printing to console
//        It should contain setX() and getX() methods where X are
//done


/**
 *
 */
package com.company;
/**
 * private variables
 */
public class AddressEntry {
    private String firstname;
    private String lastname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String telephone;

    /**
     *class constructor
     * @param firstname: first name of the contact
     * @param lastname: last name of the contact
     * @param street: the street and house number associated with the contact in the US
     * @param city: the city associated with the address in the US
     * @param state: the US state associated with the address
     * @param zip: the zip code associated with the address in the US
     * @param email: email the user wants to have on record for their contact
     * @param telephone: phone number the user has for their contact
     */
    public AddressEntry(String firstname, String lastname, String street, String city, String state, String zip, String email, String telephone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.telephone = telephone;
    }

    public AddressEntry() {

    }

    /**
     * gets first name
     * @return: returns the first name
     */
    public String getFirstname() { return firstname; }

    /**
     * sets the first name
     * @param firstname the first name set by the user however they desire
     */
    public static void setFirstname(String firstname) {
        firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public static void setLastname(String lastname) {
        lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public static void setStreet(String street) {
        street = street;
    }

    public String getCity() {
        return city;
    }

    public static void setCity(String city) {
        city = city;
    }

    public String getState() {
        return state;
    }

    public static void setState(String state) {
        state = state;
    }

    public String getZip() {
        return zip;
    }

    public static void setZip(String zip) {
        zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephoneNumber(String telephone) {
        telephone = telephone;
    }

    @Override
    public String toString() {
        return "AddressEntry{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}





