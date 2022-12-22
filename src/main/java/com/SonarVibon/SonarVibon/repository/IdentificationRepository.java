package com.SonarVibon.SonarVibon.repository;

import com.SonarVibon.SonarVibon.model.Identification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdentificationRepository extends JpaRepository<Identification,String> {

    @Query("SELECT f FROM Identification f where f.numbers like %:number%")
    List<Identification> getIdentificationByNumbers(@Param("number") String number);

}
