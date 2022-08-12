package com.bridgelabz.addressbook.Controller;


import com.bridgelabz.addressbook.Dto.AddressBookDto;
import com.bridgelabz.addressbook.service.AddressBookService;
import com.bridgelabz.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    IAddressBookService service;
    @GetMapping("/get")
    public ResponseEntity<String> getData(){
        return  new ResponseEntity<String> ("Get Call",HttpStatus.OK);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<String> getById(@PathVariable("id") long id){
        return new ResponseEntity<String> ("Call for id "+id,HttpStatus.OK);
    }

    // Using ResponseEntity to return json response

    @PostMapping("/post")
    public ResponseEntity<AddressBookDto> add(@RequestBody AddressBookDto addressBookDto){
        return new ResponseEntity<AddressBookDto>(addressBookDto,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBookDto> update(@RequestBody AddressBookDto addressBookDto,@PathVariable long id){
        return new ResponseEntity<AddressBookDto>(addressBookDto,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(){
        return new ResponseEntity<String>("Delete call",HttpStatus.OK);
    }

}