package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.services.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prof")
public class ProfessorController {

    @Autowired
    private ProfService service;

    @PostMapping(value = "/class/{class}/table/{tabela}/changeAllStatusOpen/{status}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity changeAllStatusOpen(@PathVariable("class") final String turma,@PathVariable("tabela") final String table,@PathVariable("status") final boolean status){
        service.changeAllStatusOpen(turma,table,status);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
