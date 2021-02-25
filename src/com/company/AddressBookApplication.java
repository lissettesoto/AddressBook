package com.company;

import java.util.Scanner;
import java.util.ArrayList;

//Uses Menu classes and AddressBook as described in this document.



public class AddressBookApplication extends Menu {

    public static void main(String[] args) {

        /**
         * Page where user selects an option to utilize the Address Book
         */
        Scanner inputScanner = new Scanner(System.in);
        int selection;
        do{
            System.out.println("Welcome to your Address Book");
            System.out.println("Options: \n1.File upload" +
                    "\n2.Manually add a contact \n3.Manually remove a contact \n4.Search for a contact \n5.View your contacts \n6.Quit");
            System.out.println("What would you like to do? Make selection and hit enter: ");

            selection = inputScanner.nextInt();

                switch (selection) {

                    /**
                     * Case 1 asks the user to paste the path to the file that they want to extract the contents from and
                     * add it to the address book
                     */
                    case 1:
                        System.out.println("Please paste path: ");
                        String filename = inputScanner.next();
                        Menu.init(filename);
                        //AddressBook.list();
                        break;

                    case 2:
                        System.out.println("Please fill out the following contact information: ");

                        String first_Name = prompt_FirstName();
                        first_Name = inputScanner.next();

                        String last_Name = prompt_LastName();
                        last_Name = inputScanner.next();

                        String street = prompt_Street();
                        street = inputScanner.next();

                        String city = prompt_City();
                        city = inputScanner.next();

                        String state = prompt_State();
                        state = inputScanner.next();

                        String zip = prompt_Zip();
                        zip = inputScanner.next();

                        String telephoneNumber = prompt_Telephone();
                        telephoneNumber = inputScanner.next();

                        String email = prompt_Email();
                        email = inputScanner.next();
                        //method to add to the address book



                        break;

                    case 3:
                        System.out.println("Contact has successfully been removed");
                        break;

                    case 4:
                        System.out.println("How would you like to search?");
                        System.out.println("1.Last name \n2. First Name");
                        int optionForSearching =  inputScanner.nextInt();
                        if (optionForSearching == 1){
                            System.out.println("Please insert last name of the contact you're searching for ");
                            //method to search by last name
                        }
                        else if (optionForSearching == 2){
                            System.out.println("Please type inputScanner the first name of the person you're searching for");
                        }
                        break;

                    case 5:
                        System.out.println("You have the following contacts in your address book");
                        AddressBook ab = new AddressBook();
                        ab.initAddressBookExercise();
                        break;

                    default:
                        System.out.println("!!!! ERROR INVALID SELECTION TRY AGAIN !!!! \n\n");
                        break;
                }
            }while (selection <7);
        inputScanner.close();

    }


}



