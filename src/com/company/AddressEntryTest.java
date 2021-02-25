package com.company;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {

    @Test
    void getFirstname() {
    }

    @Test
    void setFirstname() {
        AddressEntry addressEntry = new AddressEntry();
        AddressEntry.setFirstname ("Test");
        assertTrue(addressEntry.getFirstname() == "test");
    }

    @Test
    void getLastname() {
    }

    @Test
    void setLastname() {
        AddressEntry addressEntry = new AddressEntry();
        AddressEntry.setLastname ("Test");
        assertTrue(addressEntry.getLastname() == "test");
    }

    @Test
    void getStreet() {
    }

    @Test
    void setStreet() {
        AddressEntry addressEntry = new AddressEntry();
        AddressEntry.setStreet("Test");
        assertTrue(addressEntry.getStreet() == "test");
    }

    @Test
    void getCity() {
    }

    @Test
    void setCity() {
        AddressEntry addressEntry = new AddressEntry();
        AddressEntry.setCity ("Test");
        assertTrue(addressEntry.getCity() == "test");
    }

    @Test
    void getState() {
    }

    @Test
    void setState() {
        AddressEntry addressEntry = new AddressEntry();
        AddressEntry.setState ("Test");
        assertTrue(addressEntry.getState() == "test");
    }

    @Test
    void getZip() {
    }

    @Test
    void setZip() {
        AddressEntry addressEntry = new AddressEntry();
        AddressEntry.setZip ("Test");
        assertTrue(addressEntry.getZip() == "test");
    }

    @Test
    void getEmail() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getTelephone() {
    }

    @Test
    void setTelephoneNumber() {
    }

    @Test
    void testToString() {
    }
}