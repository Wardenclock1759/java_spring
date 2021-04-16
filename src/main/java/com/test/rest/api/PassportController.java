package com.test.rest.api;

import com.test.rest.model.Passport;
import com.test.rest.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassportController {
    private final PassportService passportService;

    @Autowired
    public PassportController(PassportService passportService) {
        this.passportService = passportService;
    }

    @PostMapping(value = "/save/passport", consumes = "application/json")
    public void addPassport(@RequestBody Passport passport) {
        passportService.addPassport(passport);
    }

    @GetMapping(value = "/passport", produces = "application/json")
    public List<Passport> getAllPassport() {
        return passportService.getAllPassports();
    }
}
