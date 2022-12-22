package com.SonarVibon.SonarVibon.services;

import com.SonarVibon.SonarVibon.model.Table2;
import com.SonarVibon.SonarVibon.repository.Table2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Table2Service {

    @Autowired
    private Table2Repository table2Repository;

    public List<Table2> getAllCalibrationDataByGroupId(String groupID){
        return table2Repository.getAllCalibrationDataByGroupId(groupID);
    }

    public void createTable2(List<Table2> list){
        for (int i=0;i< list.size();i++){
            Table2 table= list.get(i);
            table.setTable2Id();
            table2Repository.save(table);
        }
    }

}
