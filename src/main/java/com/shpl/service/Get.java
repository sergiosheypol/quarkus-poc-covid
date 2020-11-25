package com.shpl.service;

import com.shpl.mapper.PatientMapper;
import com.shpl.model.Patient;
import com.shpl.repository.PatientRepository;
import org.bson.types.ObjectId;

import java.util.Optional;

public interface Get {

    PatientRepository getRepository();

    PatientMapper getMapper();

    default Optional<Patient> findById(final String id) {
        return getRepository()
                .findByIdOptional(this.getObjectId(id))
                .filter(e -> Optional.ofNullable(e.getId()).isPresent())
                .map(getMapper()::toModel);
    }

    private ObjectId getObjectId(final String id) {
        return new ObjectId(id);
    }


}
