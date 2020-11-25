package com.shpl.service;

import com.shpl.mapper.PatientMapper;
import com.shpl.repository.PatientRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PatientService implements Create, Get, Delete {

    @Inject
    PatientRepository repository;

    @Inject
    PatientMapper mapper;

    @Override
    public PatientRepository getRepository() {
        return this.repository;
    }

    @Override
    public PatientMapper getMapper() {
        return this.mapper;
    }
}
