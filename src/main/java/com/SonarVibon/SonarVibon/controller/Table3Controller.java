package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Table3;
import com.SonarVibon.SonarVibon.services.Table3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table3")
public class Table3Controller {

    @Autowired
    private Table3Service table3Service;


    @GetMapping(value = "/search")
    public Iterable<Table3> getTable3ByGroupId(@RequestParam("groupId") final String groupId){
        return table3Service.getAllHookeDataByGroupId(groupId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTable3(@RequestBody List<Table3> list){
        table3Service.createTable3(list);
    }


}
