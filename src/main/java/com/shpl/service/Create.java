package com.shpl.service;

import com.shpl.model.Patient;

public interface Create {
    default Patient create(final Patient patient) {
        return patient.withId(1).withPositive(Boolean.TRUE);
    }
}
