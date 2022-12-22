package com.SonarVibon.SonarVibon.services;

import com.SonarVibon.SonarVibon.model.Table1;
import com.SonarVibon.SonarVibon.repository.Table1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table1Service {

    @Autowired
    private Table1Repository table1Repository;

    public Table1 getIdentificationByNumber(String groupId){
        return table1Repository.getTable1ByGroupId(groupId);
    }

    public Table1 create(Table1 table){
        return table1Repository.save(table);
    }

}
