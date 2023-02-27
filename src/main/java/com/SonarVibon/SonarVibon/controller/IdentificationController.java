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

    @GetMapping(value = "/class/search")
    public Iterable<Identification> getIdentificationByClass(@RequestParam("class") final String turma){
        return identificationService.getIdentificationByClass(turma);
    }

    @GetMapping(value = "/group/search")
    public Iterable<Identification> getIdentificationByGroup(@RequestParam("group") final String grupo){
        return identificationService.getIdentificationByGroup(grupo);
    }

    @GetMapping(value = "/class/{turma}/group/{grupo}")
    public Iterable<Identification> getIdentificationByClassAndGroup(@PathVariable("turma") final String turma,@PathVariable("grupo") final String grupo){
        return identificationService.getIdentificationByClassAndGroup(turma,grupo);
    }
}
