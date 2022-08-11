package com.bridgelabz.addressbook.Controller;


import com.bridgelabz.addressbook.Dto.AddressBookDto;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/get")
    public ResponseEntity<String> getData(){
        return  new ResponseEntity<String> ("Get Call",HttpStatus.OK);
    }
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<String> getById(@PathVariable("id") long id){
        return new ResponseEntity<String> ("Call for id "+id,HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<String> add(@RequestBody AddressBookDto addressBookDto){
        return new ResponseEntity<String>("add to addressbook"+addressBookDto,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody AddressBookDto addressBookDto,@PathVariable long id){
        return new ResponseEntity<String>("update addressbook of id: "+id +" "+addressBookDto,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(){
        return new ResponseEntity<String>("Delete call",HttpStatus.OK);
    }

}
