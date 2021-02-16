package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

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


    //read in data from a file
    void init(String filename) {

        Scanner inputScanner = null;

        try {
            inputScanner = new Scanner(new File("EmployeeData-1.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

        inputScanner.nextLine();//this will read in a header assuming there is one

        while (inputScanner.hasNext()) {
            String[] fields = inputScanner.nextLine().split(",");

            String firstname = fields[0];
            String lastname = fields[1];
            String street = fields[2];
            String city = fields[3];
            String zip = fields[4];
            String email = fields[5];
            String telephone = fields[6];
            String eMail = fields[7];
            //		String record  = inputScanner.nextLine();
            //		String [] fields = record.split(",");
            //NewEmployee newEmployees = new NewEmployee(fields[0],fields[1],fields[2],fields[3],fields[4], fields [5], fields [6], fields [7]);
            //newEmployee.add(newEmployees);
        }//end while
    }
}

