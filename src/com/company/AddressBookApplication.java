package com.company;

public class AddressBookApplication extends Menu {

    public static void main(String[] args) {
        String first_Name = prompt_FirstName();
        String last_Name = prompt_LastName();
        String street = prompt_Street();
        String city = prompt_City();
        String state = prompt_State();
        String zip = prompt_Zip();
        String telephone = prompt_Telephone();
        String email = prompt_Email();
        //***YOU NOW FINISH CODE TO CALL ALL the rest of the static methods of the Menu class


        //creating object
        AddressBook ab = new AddressBook();
        ab.initAddressBookExercise();

    }
}
