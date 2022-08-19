package com.blz.AddressBook.Dto;

import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookDto {

    //	private long contactId;
    @Pattern(regexp="[A-Z]{3,}$",message="Invalid firstname")
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long zip;
    private long phoneNumber;
    private String Mail;
}