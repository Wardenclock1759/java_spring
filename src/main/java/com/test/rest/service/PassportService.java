package com.test.rest.service;

import com.test.rest.model.Passport;
import com.test.rest.storage.PassportStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportService {

    private final PassportStorage passportStorage;

    @Autowired
    public PassportService(@Qualifier("localdb") PassportStorage passportStorage) {
        this.passportStorage = passportStorage;
    }

    public int addPassport(Passport passport) {
        return passportStorage.addPassport(passport);
    }

    public List<Passport> getAllPassports() {
        return passportStorage.getAllPassports();
    }
}
