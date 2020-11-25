package com.shpl.service;

import com.shpl.entity.PatientEntity;
import com.shpl.mapper.PatientMapper;
import com.shpl.model.Patient;
import com.shpl.repository.PatientRepository;

import java.util.Optional;

public interface Create {

    PatientRepository getRepository();

    PatientMapper getMapper();

    default Patient create(final Patient patient) {
        return Optional.of(patient)
                .map(p -> p.withPositive(Boolean.TRUE))
                .map(getMapper()::toEntity)
                .map(this::persist)
                .map(getMapper()::toModel)
                .orElse(getMapper().toEmptyPatient());
    }

    private PatientEntity persist(final PatientEntity entity) {
        this.getRepository().persist(entity);
        return entity;
    }


}
