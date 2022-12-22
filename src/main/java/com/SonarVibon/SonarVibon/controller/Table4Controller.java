package com.SonarVibon.SonarVibon.controller;


import com.SonarVibon.SonarVibon.model.Table1;
import com.SonarVibon.SonarVibon.model.Table4;
import com.SonarVibon.SonarVibon.services.Table4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/table4")
public class Table4Controller {

    @Autowired
    private Table4Service table4Service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Table4> createTable4(@RequestBody final Table4 table){
        return new ResponseEntity<>(table4Service.createTable4(table), HttpStatus.CREATED);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<Table4> getTable4ByGroupId(@RequestParam("groupId") final String groupId){
        final Table4 table = table4Service.getTable4DataByGroupId(groupId);
        return ResponseEntity.ok().body(table);
    }

}
