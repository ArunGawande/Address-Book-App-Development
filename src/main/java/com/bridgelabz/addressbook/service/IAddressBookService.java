package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.Dto.AddressBookDto;
import com.bridgelabz.addressbook.model.AddressBookModel;

import java.util.List;

public interface IAddressBookService {
    AddressBookModel create(AddressBookModel addressBookDto);

    List<AddressBookModel> readList();

    AddressBookModel readById(long contactId);

    AddressBookModel update(long contactId, AddressBookDto addressBookDto);

    AddressBookModel delete(long contactId);
}
