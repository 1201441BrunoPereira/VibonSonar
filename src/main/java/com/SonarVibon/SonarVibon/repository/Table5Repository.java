package com.SonarVibon.SonarVibon.repository;


import com.SonarVibon.SonarVibon.model.Table5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Table5Repository extends JpaRepository<Table5,String> {

    @Query("SELECT f FROM Table5 f where f.groupId = :groupId")
    Table5 getTable5ByGroupId(@Param("groupId") String groupId);

}
