package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Table5;
import com.SonarVibon.SonarVibon.services.Table5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/table5")
public class Table5Controller {

    @Autowired
    private Table5Service table5Service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Table5> createTable5(@RequestBody final Table5 table){
        return new ResponseEntity<>(table5Service.createTable5(table), HttpStatus.CREATED);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<Table5> getTable5ByGroupId(@RequestParam("groupId") final String groupId){
        final Table5 table = table5Service.getTable5DataByGroupId(groupId);
        return ResponseEntity.ok().body(table);
    }

}
