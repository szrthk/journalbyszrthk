package com.szrthk.journalbyszrthk.repo;

import com.szrthk.journalbyszrthk.entity.Journal;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepo extends MongoRepository<Journal, ObjectId> {
    // here we are saying that we are extending journal repo tgo mongo repositery which basically means that
    // i can use functions in mongo db repo
}
