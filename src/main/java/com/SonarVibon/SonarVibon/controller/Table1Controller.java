package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Identification;
import com.SonarVibon.SonarVibon.model.Table1;
import com.SonarVibon.SonarVibon.services.Table1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/table1")
public class Table1Controller {

    @Autowired
    private Table1Service table1Service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Table1> createTable1(@RequestBody final Table1 table){
        return new ResponseEntity<>(table1Service.create(table), HttpStatus.CREATED);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<Table1> getTable1ByGroupId(@RequestParam("groupId") final String groupId){
        final Table1 table = table1Service.getIdentificationByNumber(groupId);
        return ResponseEntity.ok().body(table);
    }
}
