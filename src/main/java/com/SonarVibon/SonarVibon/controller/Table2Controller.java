package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Table1;
import com.SonarVibon.SonarVibon.model.Table2;
import com.SonarVibon.SonarVibon.services.Table2Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table2")
public class Table2Controller {

    @Autowired
    private Table2Service table2Service;


    @GetMapping(value = "/search")
    public ResponseEntity<Table2> getTable2ByGroupId(@RequestParam("groupId") final String groupId){
        final Table2 table = table2Service.getAllCalibrationDataByGroupId(groupId);
        return ResponseEntity.ok().body(table);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Table2> createTable2(@RequestBody final Table2 table){
        return new ResponseEntity<>(table2Service.create(table), HttpStatus.CREATED);
    }
}
