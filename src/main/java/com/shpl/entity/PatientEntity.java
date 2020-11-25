package com.shpl.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import lombok.*;
import org.bson.types.ObjectId;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MongoEntity(collection = "patient")
public class PatientEntity {

    private ObjectId id;
    private String name;
    private String surname;
    private Boolean positive;
}


