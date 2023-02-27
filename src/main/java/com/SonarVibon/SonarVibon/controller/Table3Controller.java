package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Table2;
import com.SonarVibon.SonarVibon.model.Table3;
import com.SonarVibon.SonarVibon.services.Table3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table3")
public class Table3Controller {

    @Autowired
    private Table3Service table3Service;


    @GetMapping(value = "/search")
    public ResponseEntity<Table3> getTable3ByGroupId(@RequestParam("groupId") final String groupId){
        final Table3 table = table3Service.getAllHookeDataByGroupId(groupId);
        return ResponseEntity.ok().body(table);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Table3> createTable3(@RequestBody final Table3 table){
        return new ResponseEntity<>(table3Service.create(table), HttpStatus.CREATED);
    }

}
