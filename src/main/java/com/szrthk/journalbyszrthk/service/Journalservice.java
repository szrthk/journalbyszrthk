package com.szrthk.journalbyszrthk.service;

import com.szrthk.journalbyszrthk.entity.Journal;
import com.szrthk.journalbyszrthk.repo.JournalRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component // chatgpt says instead of component i can also use @Service, special type of component for service layer
public class Journalservice {
    @Autowired
    private JournalRepo journalRepo; // basically we are injecting repo here coz we want to use things

    public void saveEntry(Journal journal){
        journalRepo.save(journal);
    }

    public List<Journal>getAll(){
        return journalRepo.findAll();
    }
    public Optional <Journal> findbyid (ObjectId id){
        return journalRepo.findById(id);
    }
    public void deletebyid(ObjectId id){
        journalRepo.deleteById(id);
        System.out.println("Entry deleted");
    }
}
