package com.SonarVibon.SonarVibon.services;


import com.SonarVibon.SonarVibon.model.Table4;
import com.SonarVibon.SonarVibon.repository.Table4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table4Service {

    @Autowired
    private Table4Repository table4Repository;

    public Table4 getTable4DataByGroupId(String groupID){
        return table4Repository.getTable4ByGroupId(groupID);
    }

    public Table4 createTable4(Table4 table4){
        if (table4.getOpen().equals("") || table4.getOpen().equals("OPEN")){
            table4.setOpen("OPEN");
        }else{
            table4.setOpen("CLOSED");
        }
        return table4Repository.save(table4);
    }

}
