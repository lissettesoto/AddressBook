//AddressBook - this class represents and contains a possibly every growing and/or shrinking "list" of AddressEntries.
// It allows for various operations such as search/find, addition and removal of AddressEntries.
//        you need to think about the efficiency of operations needed --see below example
//        session --list alphabetic order (sorted), add, remove, find (search), read in from file

package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBook {

    Scanner inputScanner = new Scanner(System.in);

    //data variable
    private static ArrayList<AddressEntry> addressBook = new ArrayList <AddressEntry>();

    public static void list(){
        for(AddressEntry addressEntry : addressBook){
            System.out.println(addressEntry);
        }
    }

    public static void add (AddressEntry contact){
        addressBook.add(contact);
    }

    /**
     *
     * @param lastName: This method accepts the last name as a parameter to find all contacts with the same last name in order to
     *                chose which one to remove from their Address Book
     * @return this method returns nothing, just removing a contact from list() list
     */
    public void removeDesiredContactByLastName (String lastName){
        System.out.println("Please enter the last name of the contact you wish to remove from your address book");
        //here would System.out.println all contacts with that last name then call the remove method java has for arraylist
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
        while (inputScanner.hasNext()){
            String [] fields = inputScanner.nextLine().split("");
            String firstName = fields[0];
            String lastName = fields [1];
            String street = fields [2];
            String city = fields [3];
            String state = fields [4];
            String zip= fields [5];
            String email = fields [6];
            String telephone = fields [7];
            ArrayList <String> persons = new ArrayList<String>();
            for (int i = 0; i> fields.length; i++){
                persons.add(fields[i].trim());
            }
        }        System.out.println("Stored!");

    }



    public void initAddressBookExercise(){
        AddressEntry contactOne = new AddressEntry("joe", "schmo","carlos bee blvd","hayward","california,","94544","joeschmo@gmail.com","555-555-5555");
        AddressEntry contactTwo = new AddressEntry("jane", "schmo","carlos bee blvd","hayward","california,","94544","janeschmo@gmail.com","555-555-5555");
        add(contactOne);
        add(contactTwo);
        list();
    }



}
