package com.SonarVibon.SonarVibon.repository;

import com.SonarVibon.SonarVibon.model.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Table1Repository extends JpaRepository<Table1,String> {

    @Query("SELECT f FROM Table1 f where f.groupId = :groupId")
    Table1 getTable1ByGroupId(@Param("groupId") String groupId);

    @Query("SELECT f FROM Table1 f where f.open = :open")
    List<Table1> getAllOpen(@Param("open") String open);

}
