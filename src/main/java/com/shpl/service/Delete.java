package com.shpl.service;

import com.shpl.repository.PatientRepository;
import org.bson.types.ObjectId;

import java.util.Optional;

public interface Delete {

    PatientRepository getRepository();

    default Boolean delete(final String id) {
        return Optional.of(id)
                .map(this::getObjectId)
                .map(getRepository()::deleteById)
                .orElse(Boolean.FALSE);
    }

    private ObjectId getObjectId(final String id) {
        return new ObjectId(id);
    }
}
