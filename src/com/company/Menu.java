package com.company;

public class Menu {
    public static String prompt_FirstName() {
        String firstName = "First Name:";
        System.out.println(firstName);
        return firstName;
        //since the return type is string i stored "First Name:" in a variable of type String
        //The same is true for the rest of the methods
    }

    public static String prompt_LastName() {
        String lastName = "Last Name:";
        System.out.println(lastName);
        return (lastName);
    }

    public static String prompt_Street() {
        String street = "Street:";
        System.out.println(street);
        return street;
    }

    public static String prompt_City() {
        String city = "City:";
        System.out.println(city);
        return city;
    }

    public static String prompt_State() {
        String state = "State:";
        System.out.println(state);
        return state;
    }

    public static String prompt_Zip() {
        String zip = "Zip:";
        System.out.println(zip);
        return zip;
    }

    public static String prompt_Telephone() {
        String phone = "Phone:";
        System.out.println(phone);
        return phone;
    }

    public static String prompt_Email() {
        String email = "Email:";
        System.out.println(email);
        return email;
    }
}
