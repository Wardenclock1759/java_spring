package com.test.rest.storage;

import com.test.rest.model.Passport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("localdb")
public class localPassportStorage implements PassportStorage{

    private static List<Passport> db = new ArrayList<>();

    @Override
    public int addPassport(UUID id, Passport passport) {
        db.add(new Passport(id, passport.getName(), passport.getBlocks()));
        return 1;
    }

    @Override
    public List<Passport> getAllPassports() {
        return db;
    }
}
