package com.szrthk.journalbyszrthk.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries")
@Data
public class Journal {
    @Id
    private ObjectId objectId;
    private String title;
    private String content;
    private LocalDateTime date;

}
