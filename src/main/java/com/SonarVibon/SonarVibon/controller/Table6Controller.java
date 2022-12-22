package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Table6;
import com.SonarVibon.SonarVibon.services.Table6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/table6")
public class Table6Controller {

    @Autowired
    private Table6Service table6Service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Table6> createTable6(@RequestBody final Table6 table){
        return new ResponseEntity<>(table6Service.createTable6(table), HttpStatus.CREATED);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<Table6> getTable6ByGroupId(@RequestParam("groupId") final String groupId){
        final Table6 table = table6Service.getTable6DataByGroupId(groupId);
        return ResponseEntity.ok().body(table);
    }


}
