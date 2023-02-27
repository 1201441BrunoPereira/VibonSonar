package com.SonarVibon.SonarVibon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table1")
public class Table1 {

    @Column
    private String open;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String groupId ;

    @Column
    private String thermometerResolution;

    @Column
    private String tapeResolution;

    @Column
    private String scaleResolution;

    @Column
    private String thermometerUncertainty;

    @Column
    private String tapeUncertainty;

    @Column
    private String scaleUncertainty;


    public Table1(String open, String groupId, String thermometerResolution, String tapeResolution, String scaleResolution, String thermometerUncertainty, String tapeUncertainty, String scaleUncertainty) {
        this.open = open;
        this.groupId = groupId;
        this.thermometerResolution = thermometerResolution;
        this.tapeResolution = tapeResolution;
        this.scaleResolution = scaleResolution;
        this.thermometerUncertainty = thermometerUncertainty;
        this.tapeUncertainty = tapeUncertainty;
        this.scaleUncertainty = scaleUncertainty;
    }

    public Table1() {
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getThermometerResolution() {
        return thermometerResolution;
    }

    public void setThermometerResolution(String thermometerResolution) {
        this.thermometerResolution = thermometerResolution;
    }

    public String getTapeResolution() {
        return tapeResolution;
    }

    public void setTapeResolution(String tapeResolution) {
        this.tapeResolution = tapeResolution;
    }

    public String getScaleResolution() {
        return scaleResolution;
    }

    public void setScaleResolution(String scaleResolution) {
        this.scaleResolution = scaleResolution;
    }

    public String getThermometerUncertainty() {
        return thermometerUncertainty;
    }

    public void setThermometerUncertainty(String thermometerUncertainty) {
        this.thermometerUncertainty = thermometerUncertainty;
    }

    public String getTapeUncertainty() {
        return tapeUncertainty;
    }

    public void setTapeUncertainty(String tapeUncertainty) {
        this.tapeUncertainty = tapeUncertainty;
    }

    public String getScaleUncertainty() {
        return scaleUncertainty;
    }

    public void setScaleUncertainty(String scaleUncertainty) {
        this.scaleUncertainty = scaleUncertainty;
    }
}
