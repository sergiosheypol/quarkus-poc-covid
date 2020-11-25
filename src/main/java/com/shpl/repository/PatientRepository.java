package com.shpl.repository;

import com.shpl.entity.PatientEntity;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PatientRepository implements PanacheMongoRepository<PatientEntity> {
}
