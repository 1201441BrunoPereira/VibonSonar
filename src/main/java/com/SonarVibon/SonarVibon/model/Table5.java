package com.SonarVibon.SonarVibon.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table5")
public class Table5 {

    private String open;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String groupId ;

    @Column
    private String mass;

    @Column
    private String massRelUncer;

    @Column
    private String massStandUncer;


    @Column
    private String initialDistance;

    @Column
    private String initialDistanceRelUncer;

    @Column
    private String initialDistanceStandUncer;

    @Column
    private String slope;

    @Column
    private String slopeRelUncer;

    @Column
    private String slopeStandUncer;

    @Column
    private String origin;

    @Column
    private String originRelUncer;

    @Column
    private String originStandUncer;

    @Column
    private String correlationCoefficient;

    @Column
    private String springConstant;

    @Column
    private String springConstantRelUncer;

    @Column
    private String springConstantStandUncer;


    public Table5(String open, String groupId, String mass, String massRelUncer, String massStandUncer, String initialDistance, String initialDistanceRelUncer, String initialDistanceStandUncer, String slope, String slopeRelUncer, String slopeStandUncer, String origin, String originRelUncer, String originStandUncer, String correlationCoefficient, String springConstant, String springConstantRelUncer, String springConstantStandUncer) {
        this.open = open;
        this.groupId = groupId;
        this.mass = mass;
        this.massRelUncer = massRelUncer;
        this.massStandUncer = massStandUncer;
        this.initialDistance = initialDistance;
        this.initialDistanceRelUncer = initialDistanceRelUncer;
        this.initialDistanceStandUncer = initialDistanceStandUncer;
        this.slope = slope;
        this.slopeRelUncer = slopeRelUncer;
        this.slopeStandUncer = slopeStandUncer;
        this.origin = origin;
        this.originRelUncer = originRelUncer;
        this.originStandUncer = originStandUncer;
        this.correlationCoefficient = correlationCoefficient;
        this.springConstant = springConstant;
        this.springConstantRelUncer = springConstantRelUncer;
        this.springConstantStandUncer = springConstantStandUncer;
    }

    public Table5() {
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

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getMassRelUncer() {
        return massRelUncer;
    }

    public void setMassRelUncer(String massRelUncer) {
        this.massRelUncer = massRelUncer;
    }

    public String getMassStandUncer() {
        return massStandUncer;
    }

    public void setMassStandUncer(String massStandUncer) {
        this.massStandUncer = massStandUncer;
    }

    public String getInitialDistance() {
        return initialDistance;
    }

    public void setInitialDistance(String initialDistance) {
        this.initialDistance = initialDistance;
    }

    public String getInitialDistanceRelUncer() {
        return initialDistanceRelUncer;
    }

    public void setInitialDistanceRelUncer(String initialDistanceRelUncer) {
        this.initialDistanceRelUncer = initialDistanceRelUncer;
    }

    public String getInitialDistanceStandUncer() {
        return initialDistanceStandUncer;
    }

    public void setInitialDistanceStandUncer(String initialDistanceStandUncer) {
        this.initialDistanceStandUncer = initialDistanceStandUncer;
    }

    public String getSlope() {
        return slope;
    }

    public void setSlope(String slope) {
        this.slope = slope;
    }

    public String getSlopeRelUncer() {
        return slopeRelUncer;
    }

    public void setSlopeRelUncer(String slopeRelUncer) {
        this.slopeRelUncer = slopeRelUncer;
    }

    public String getSlopeStandUncer() {
        return slopeStandUncer;
    }

    public void setSlopeStandUncer(String slopeStandUncer) {
        this.slopeStandUncer = slopeStandUncer;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginRelUncer() {
        return originRelUncer;
    }

    public void setOriginRelUncer(String originRelUncer) {
        this.originRelUncer = originRelUncer;
    }

    public String getOriginStandUncer() {
        return originStandUncer;
    }

    public void setOriginStandUncer(String originStandUncer) {
        this.originStandUncer = originStandUncer;
    }

    public String getCorrelationCoefficient() {
        return correlationCoefficient;
    }

    public void setCorrelationCoefficient(String correlationCoefficient) {
        this.correlationCoefficient = correlationCoefficient;
    }

    public String getSpringConstant() {
        return springConstant;
    }

    public void setSpringConstant(String springConstant) {
        this.springConstant = springConstant;
    }

    public String getSpringConstantRelUncer() {
        return springConstantRelUncer;
    }

    public void setSpringConstantRelUncer(String springConstantRelUncer) {
        this.springConstantRelUncer = springConstantRelUncer;
    }

    public String getSpringConstantStandUncer() {
        return springConstantStandUncer;
    }

    public void setSpringConstantStandUncer(String springConstantStandUncer) {
        this.springConstantStandUncer = springConstantStandUncer;
    }
}
