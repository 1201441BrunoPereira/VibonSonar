package com.SonarVibon.SonarVibon.services;

import com.SonarVibon.SonarVibon.model.Table6;
import com.SonarVibon.SonarVibon.repository.Table6Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table6Service {

    @Autowired
    private Table6Repository table6Repository;

    public Table6 getTable6DataByGroupId(String groupID){
        return table6Repository.getTable6ByGroupId(groupID);
    }

    public Table6 createTable6(Table6 table6){
        if (table6.getOpen().equals("") || table6.getOpen().equals("OPEN")){
            table6.setOpen("OPEN");
        }else{
            table6.setOpen("CLOSED");
        }
        return table6Repository.save(table6);
    }

}
