package com.SonarVibon.SonarVibon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table1")
public class Table1 {

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String groupId ;

    @Column
    private Float thermometerResolution;

    @Column
    private Float tapeResolution;

    @Column
    private Float scaleResolution;

    @Column
    private Float thermometerUncertainty;

    @Column
    private Float tapeUncertainty;

    @Column
    private Float scaleUncertainty;


    public Table1(String groupId, Float thermometerResolution, Float tapeResolution, Float scaleResolution, Float thermometerUncertainty, Float tapeUncertainty, Float scaleUncertainty) {
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Float getThermometerResolution() {
        return thermometerResolution;
    }

    public void setThermometerResolution(Float thermometerResolution) {
        this.thermometerResolution = thermometerResolution;
    }

    public Float getTapeResolution() {
        return tapeResolution;
    }

    public void setTapeResolution(Float tapeResolution) {
        this.tapeResolution = tapeResolution;
    }

    public Float getScaleResolution() {
        return scaleResolution;
    }

    public void setScaleResolution(Float scaleResolution) {
        this.scaleResolution = scaleResolution;
    }

    public Float getThermometerUncertainty() {
        return thermometerUncertainty;
    }

    public void setThermometerUncertainty(Float thermometerUncertainty) {
        this.thermometerUncertainty = thermometerUncertainty;
    }

    public Float getTapeUncertainty() {
        return tapeUncertainty;
    }

    public void setTapeUncertainty(Float tapeUncertainty) {
        this.tapeUncertainty = tapeUncertainty;
    }

    public Float getScaleUncertainty() {
        return scaleUncertainty;
    }

    public void setScaleUncertainty(Float scaleUncertainty) {
        this.scaleUncertainty = scaleUncertainty;
    }
}
