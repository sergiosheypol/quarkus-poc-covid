package com.shpl.service;

import com.shpl.model.Patient;

public interface Get {
    default Patient get(final Integer id) {
        return Patient.builder().id(id).build();
    }
}
