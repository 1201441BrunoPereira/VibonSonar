package com.SonarVibon.SonarVibon.services;


import com.SonarVibon.SonarVibon.model.Table3;
import com.SonarVibon.SonarVibon.repository.Table3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Table3Service {

    @Autowired
    private Table3Repository table3Repository;

    public List<Table3> getAllHookeDataByGroupId(String groupID){
        return table3Repository.getAllHookeDataByGroupId(groupID);
    }

    public void createTable3(List<Table3> list){
        for (int i=0;i< list.size();i++){
            Table3 table= list.get(i);
            table.setTable3Id();
            table3Repository.save(table);
        }
    }


}
