package com.blz.AddressBook.Model;


import com.blz.AddressBook.Dto.AddressBookDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class AddressBookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long zip;
    private long phoneNumber;
    private String mail;

    public AddressBookModel(AddressBookDto addressBookDto) {
        this.firstName=addressBookDto.getFirstName();
        this.lastName=addressBookDto.getLastName();
        this.address=addressBookDto.getAddress();
        this.city=addressBookDto.getCity();
        this.state=addressBookDto.getState();
        this.zip=addressBookDto.getZip();
        this.phoneNumber=addressBookDto.getPhoneNumber();
        this.mail=addressBookDto.getMail();

    }

    public AddressBookModel() {
        super();
    }

}