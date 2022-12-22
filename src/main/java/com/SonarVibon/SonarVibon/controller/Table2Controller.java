package com.SonarVibon.SonarVibon.controller;

import com.SonarVibon.SonarVibon.model.Table2;
import com.SonarVibon.SonarVibon.services.Table2Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table2")
public class Table2Controller {

    @Autowired
    private Table2Service table2Service;


    @GetMapping(value = "/search")
    public Iterable<Table2> getTable2ByGroupId(@RequestParam("groupId") final String groupId){
        return table2Service.getAllCalibrationDataByGroupId(groupId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTable2(@RequestBody List<Table2> list){
        table2Service.createTable2(list);
    }

}
