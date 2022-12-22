package com.SonarVibon.SonarVibon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "table3")
public class Table3 {

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String table3Id;

    @Column(nullable = false, length = 36)
    private String groupId;

    @Column
    private Float distance;

    @Column
    private Float mass;


    public Table3(String groupId, Float distance, Float mass) {
        setTable3Id();
        this.groupId = groupId;
        this.distance = distance;
        this.mass = mass;
    }

    public Table3() {
    }

    public String getTable3Id() {
        return table3Id;
    }

    public static String generateUUID(){
        UUID Uuid = UUID.randomUUID();
        return Uuid.toString();
    }
    public void setTable3Id() {
        table3Id = generateUUID();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getMass() {
        return mass;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }
}
