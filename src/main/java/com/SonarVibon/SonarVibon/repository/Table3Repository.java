package com.SonarVibon.SonarVibon.repository;

import com.SonarVibon.SonarVibon.model.Table3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Table3Repository extends JpaRepository<Table3,String> {

    @Query("SELECT f FROM Table3 f where f.groupId = :groupId")
    Table3 getHookeLawDataByGroupId(@Param("groupId") String groupId);

    @Query("SELECT f FROM Table3 f where f.open = :open")
    List<Table3> getAllOpen(@Param("open") String open);
}
