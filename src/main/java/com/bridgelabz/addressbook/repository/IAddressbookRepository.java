package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressbookRepository extends JpaRepository<AddressBookModel, Long> {
}
