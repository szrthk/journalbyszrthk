package com.szrthk.journalbyszrthk.controller;

import com.szrthk.journalbyszrthk.entity.Journal;
import com.szrthk.journalbyszrthk.service.Journalservice;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;
@Data
@RestController
@RequestMapping("/journal")
public class journalcontroller {

    @Autowired
    private Journalservice journalservice; //the name we give is used throughout

    @GetMapping
    public List <Journal> getAll(){
        return journalservice.getAll();
    }
    @GetMapping("/hi")
    public String greet(){
        return ("Hi sarthak");
    }

    @PostMapping
    public ResponseEntity<Journal> createEntry(@RequestBody Journal myEntry){
        try {
            //myEntry.setDate(LocalDateTime.now()); //setting date and time on that
            journalservice.saveEntry(myEntry);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("id/{myId}")
    public ResponseEntity<Journal> getjournalbyid(@PathVariable ObjectId myId){
        Optional <Journal> journal = journalservice.findbyid(myId);
        if (journal.isPresent()){
            return new ResponseEntity<>(journal.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{myId}")
    public boolean deletebyid(@PathVariable ObjectId myId){
        journalservice.deletebyid(myId);
        return true;
    }

    @PutMapping("id/{myId}")
    public Journal updatejournalbyentry(@PathVariable ObjectId myId, @RequestBody Journal newEntry){
        Journal old = journalservice.findbyid(myId).orElse(null);
        if (old != null){
            old.setTitle(newEntry.getTitle()!= null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent()!= null && !newEntry.equals("") ? newEntry.getContent(): old.getContent());
        }

        journalservice.saveEntry(old);
        return old;
    }
}
