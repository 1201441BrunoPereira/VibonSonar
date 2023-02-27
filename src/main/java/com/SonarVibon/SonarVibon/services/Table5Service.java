package com.SonarVibon.SonarVibon.services;


import com.SonarVibon.SonarVibon.model.Table5;
import com.SonarVibon.SonarVibon.repository.Table5Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Table5Service {

    @Autowired
    private Table5Repository table5Repository;

    public Table5 getTable5DataByGroupId(String groupID){
        return table5Repository.getTable5ByGroupId(groupID);
    }

    public Table5 createTable5(Table5 table5){
        if (table5.getOpen().equals("") || table5.getOpen().equals("OPEN")){
            table5.setOpen("OPEN");
        }else{
            table5.setOpen("CLOSED");
        }
        return table5Repository.save(table5);
    }


}
