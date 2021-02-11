package com.company;

import java.util.ArrayList;

public class AddressBook {

    //data variable
    private static ArrayList<AddressEntry> addBook = new ArrayList <AddressEntry>();

    public void list(){
        for(AddressEntry addressEntry : addBook ){
            System.out.println(addressEntry);
        }
    }

    public void add (AddressEntry addressEntry){
        addBook.add(addressEntry);
    }

    public void initAddressBookExercise(){
        AddressEntry contactOne = new AddressEntry("joe", "schmo","carlos bee blvd","hayward","california,",94544,"joeschmo@gmail.com","555-555-5555");
        AddressEntry contactTwo = new AddressEntry("jane", "schmo","carlos bee blvd","hayward","california,",94544,"janeschmo@gmail.com","555-555-5555");
        add(contactOne);
        add(contactTwo);
        list();
    }

}
