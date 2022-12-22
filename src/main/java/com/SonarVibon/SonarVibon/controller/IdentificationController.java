package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Identification;
import com.SonarVibon.SonarVibon.model.IdentificationDTO;
import com.SonarVibon.SonarVibon.services.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/id")
public class IdentificationController {

    @Autowired
    private IdentificationService identificationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Identification> createId(@RequestBody final IdentificationDTO id){
        return new ResponseEntity<>(identificationService.create(id), HttpStatus.CREATED);
    }

    @GetMapping(value = "/search")
    public Iterable<Identification> getIdentificationByNumber(@RequestParam("number") final String number){
        return identificationService.getIdentificationByNumber(number);
    }


}
