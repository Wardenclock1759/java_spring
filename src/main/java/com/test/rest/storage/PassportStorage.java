package com.test.rest.storage;

import com.test.rest.model.Passport;

import java.util.List;
import java.util.UUID;

public interface PassportStorage {
    int addPassport(UUID id, Passport passport);
    default int addPassport(Passport passport) {
        UUID id = UUID.randomUUID();
        return addPassport(id, passport);
    }

    List<Passport> getAllPassports();
}
