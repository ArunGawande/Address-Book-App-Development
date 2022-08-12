package com.bridgelabz.addressbook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressbook.model.AddressBookModel;


public interface IAddressBookRepository extends JpaRepository<AddressBookModel, Long >{

}