package com.SonarVibon.SonarVibon.services;

import com.SonarVibon.SonarVibon.model.Table3;
import com.SonarVibon.SonarVibon.repository.Table3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table3Service {

    @Autowired
    private Table3Repository table3Repository;

    public Table3 getAllHookeDataByGroupId(String groupID){
        return table3Repository.getHookeLawDataByGroupId(groupID);
    }

    public Table3 create(Table3 table){
        if (table.getOpen().equals("") || table.getOpen().equals("OPEN")){
            table.setOpen("OPEN");
        }else{
            table.setOpen("CLOSED");
        }
        return table3Repository.save(table);
    }



}
