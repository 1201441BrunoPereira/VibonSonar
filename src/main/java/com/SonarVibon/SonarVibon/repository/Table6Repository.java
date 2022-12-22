package com.SonarVibon.SonarVibon.repository;

import com.SonarVibon.SonarVibon.model.Table6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Table6Repository extends JpaRepository<Table6,String> {

    @Query("SELECT f FROM Table6 f where f.groupId = :groupId")
    Table6 getTable6ByGroupId(@Param("groupId") String groupId);

}
