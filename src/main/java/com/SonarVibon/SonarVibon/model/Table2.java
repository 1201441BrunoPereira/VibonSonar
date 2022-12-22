package com.SonarVibon.SonarVibon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "table2")
public class Table2 {

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String table2Id;

    @Column(nullable = false, length = 36)
    private String groupId;

    @Column
    private Float distance;

    @Column
    private Float dtEco;

    public Table2(String groupId, Float distance, Float dtEco) {
        setTable2Id();
        this.groupId = groupId;
        this.distance = distance;
        this.dtEco = dtEco;
    }

    public Table2() {
    }

    public static String generateUUID(){
        UUID Uuid = UUID.randomUUID();
        return Uuid.toString();
    }

    public String getTable2Id() {
        return table2Id;
    }

    public void setTable2Id( ) {
        table2Id = generateUUID();
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

    public Float getDtEco() {
        return dtEco;
    }

    public void setDtEco(Float dtEco) {
        this.dtEco = dtEco;
    }
}
