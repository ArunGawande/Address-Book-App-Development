package com.bridgelabz.addressbook.Controller;

import java.util.List;

import com.bridgelabz.addressbook.Dto.AddressBookDto;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    IAddressBookService service;


    @GetMapping("/readList")
    public List<AddressBookModel> readAll(){
        return service.readList();
    }

    @GetMapping("/readbyid/{id}")
    public AddressBookModel readById(@PathVariable long id) {
        return service.readById(id);
    }

    @PostMapping("/create")
    public AddressBookModel create(@RequestBody AddressBookModel obj) {
        return service.create(obj);
    }

    @PutMapping("/update/{id}")
    public AddressBookModel update(@RequestBody AddressBookDto obj, @PathVariable long id) {

        return service.update(id,obj);
    }

    @DeleteMapping("/delete/{id}")
    public AddressBookModel delete(@PathVariable long id) {
        return service.delete(id);
    }

}