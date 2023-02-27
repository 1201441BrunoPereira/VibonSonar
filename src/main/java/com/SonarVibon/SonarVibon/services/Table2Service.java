package com.SonarVibon.SonarVibon.services;


import com.SonarVibon.SonarVibon.model.Table2;
import com.SonarVibon.SonarVibon.repository.Table2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Table2Service {

    @Autowired
    private Table2Repository table2Repository;

    public Table2 getAllCalibrationDataByGroupId(String groupID){
        return table2Repository.getCalibrationDataByGroupId(groupID);
    }

    public Table2 create(Table2 table){
        if (table.getOpen().equals("") || table.getOpen().equals("OPEN")){
            table.setOpen("OPEN");
        }else{
            table.setOpen("CLOSED");
        }
        return table2Repository.save(table);
    }

}
