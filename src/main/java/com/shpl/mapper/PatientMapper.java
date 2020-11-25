package com.shpl.mapper;

import com.shpl.entity.PatientEntity;
import com.shpl.model.Patient;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PatientMapper {

    public PatientEntity toEntity(final Patient patient) {
        return PatientEntity.builder()
                .id(new ObjectId())
                .name(patient.getName())
                .surname(patient.getSurname())
                .positive(patient.getPositive())
                .build();
    }

    public Patient toModel(final PatientEntity entity) {
        return Patient.builder()
                .id(entity.getId().toHexString())
                .name(entity.getName())
                .surname(entity.getSurname())
                .positive(entity.getPositive())
                .build();
    }

    public Patient toEmptyPatient() {
        return Patient.builder().build();
    }
}
