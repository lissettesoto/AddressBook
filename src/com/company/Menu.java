//Menu- this class is used to display menu options to the user. This includes
//        a) Loading of entries from a file.
//        b) Addition - prompting user for information to be used to create a new AddressEntry
//        c) Removal - removing of an AddressEntry from the AddressBook. First a find is done (see below example session) and then the user selects from the find results what entry to remove.
//        d) Find - prompts users for the begining of the users last name (they can enter a complete last name or just the start....all entries with that as the first part of their last name will be displayed). Note in the case when more then one entry is found a set will be returned.
//        e) Listing - listing (a "dump") of the addresses in alphabetic order by the person's last name.
//        f) Quit -note we are NOT saving any newly created AddressEntry objects (or removing objects either are not updated to the file) to the file, this data is lost, we will handle this issue in Project 2 when we store data more apporpriately in a database.
//        NOTE: we are altering our prompt_* methods so that now they not only print out the prompt but, wait for the User to type into standard input and reads in
//        the value and as necessary (for zip which is of type int) converts to appropriate type and returns that value. So prompt_Email() will ask user for Email read in what
//        they typed and and returns a String. For prompt_Zip() it asks user for a zip and reads in value and converts to an int and returns this.
package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    /**
     * @return firstName returns the String "First Name:"
     */
    public static String prompt_FirstName() {
        String firstName = "First Name: ";
        System.out.println(firstName);
        return firstName;
    }


    /**
     * @return lastName returns the String "Last Name:"
     */
    public static String prompt_LastName() {
        String lastName = "Last Name: ";
        System.out.println(lastName);
        return lastName;
    }


    /**
     * @return street returns the String "Street:"
     */
    public static String prompt_Street() {
        String street = "Street: ";
        System.out.println(street);
        return street;
    }

    /**
     * @return city returns the String "City:"
     */
    public static String prompt_City() {
        String city = "City: ";
        System.out.println(city);
        return city;
    }

    /**
     * @return state returns the String "State:"
     */
    public static String prompt_State() {
        String state = "State: ";
        System.out.println(state);
        return state;
    }

    /**
     * @return zip returns the string "Zip:"
     */
    public static String prompt_Zip() {
        String zip = "Zip: ";
        System.out.println(zip);
        return zip;
    }

    /**
     * @return phone returns the String "Phone:"
     */
    public static String prompt_Telephone() {
        String phone = "Phone: ";
        System.out.println(phone);
        return phone;
    }

    /**
     * @return email returns the string "Email:"
     */
    public static String prompt_Email() {
        String email = "Email: ";
        System.out.println(email);
        return email;
    }


    public static void init(String filename) {
        File newFile = new File(filename);
        Scanner inputScanner = new Scanner(filename);
        try {
            inputScanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        while (inputScanner.hasNextLine()) {
            inputScanner.nextLine();
        }

        //here i store every line
        while (inputScanner.hasNext()) {
            String[] fields = inputScanner.nextLine().split("");
            String firstName = fields[0];
            String lastName = fields[1];
            String street = fields[2];
            String city = fields[3];
            String state = fields[4];
            String zip = fields[5];
            String email = fields[6];
            String telephone = fields[7];
            ArrayList<String> persons = new ArrayList<String>();
            for (int i = 0; i > fields.length; i++) {
                persons.add(fields[i].trim());
            }
        }
        System.out.println("Stored! ");
    }
}
