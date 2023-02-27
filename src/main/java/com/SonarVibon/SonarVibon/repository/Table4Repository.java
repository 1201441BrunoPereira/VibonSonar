package com.SonarVibon.SonarVibon.repository;

import com.SonarVibon.SonarVibon.model.Table4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Table4Repository extends JpaRepository<Table4,String> {

    @Query("SELECT f FROM Table4 f where f.groupId = :groupId")
    Table4 getTable4ByGroupId(@Param("groupId") String groupId);

    @Query("SELECT f FROM Table4 f where f.open = :open")
    List<Table4> getAllOpen(@Param("open") String open);

}
