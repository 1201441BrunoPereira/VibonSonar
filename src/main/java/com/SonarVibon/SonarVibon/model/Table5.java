package com.SonarVibon.SonarVibon.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table5")
public class Table5 {

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String groupId ;

    @Column
    private Float mass;

    @Column
    private Float massRelUncer;

    @Column
    private Float massStandUncer;


    @Column
    private Float initialDistance;

    @Column
    private Float initialDistanceRelUncer;

    @Column
    private Float initialDistanceStandUncer;

    @Column
    private Float slope;

    @Column
    private Float slopeRelUncer;

    @Column
    private Float slopeStandUncer;

    @Column
    private Float origin;

    @Column
    private Float originRelUncer;

    @Column
    private Float originStandUncer;

    @Column
    private Float correlationCoefficient;

    @Column
    private Float springConstant;

    @Column
    private Float springConstantRelUncer;

    @Column
    private Float springConstantStandUncer;


    public Table5(String groupId, Float mass, Float massRelUncer, Float massStandUncer, Float initialDistance, Float initialDistanceRelUncer, Float initialDistanceStandUncer, Float slope, Float slopeRelUncer, Float slopeStandUncer, Float origin, Float originRelUncer, Float originStandUncer, Float correlationCoefficient, Float springConstant, Float springConstantRelUncer, Float springConstantStandUncer) {
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

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Float getMass() {
        return mass;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }

    public Float getMassRelUncer() {
        return massRelUncer;
    }

    public void setMassRelUncer(Float massRelUncer) {
        this.massRelUncer = massRelUncer;
    }

    public Float getMassStandUncer() {
        return massStandUncer;
    }

    public void setMassStandUncer(Float massStandUncer) {
        this.massStandUncer = massStandUncer;
    }

    public Float getInitialDistance() {
        return initialDistance;
    }

    public void setInitialDistance(Float initialDistance) {
        this.initialDistance = initialDistance;
    }

    public Float getInitialDistanceRelUncer() {
        return initialDistanceRelUncer;
    }

    public void setInitialDistanceRelUncer(Float initialDistanceRelUncer) {
        this.initialDistanceRelUncer = initialDistanceRelUncer;
    }

    public Float getInitialDistanceStandUncer() {
        return initialDistanceStandUncer;
    }

    public void setInitialDistanceStandUncer(Float initialDistanceStandUncer) {
        this.initialDistanceStandUncer = initialDistanceStandUncer;
    }

    public Float getSlope() {
        return slope;
    }

    public void setSlope(Float slope) {
        this.slope = slope;
    }

    public Float getSlopeRelUncer() {
        return slopeRelUncer;
    }

    public void setSlopeRelUncer(Float slopeRelUncer) {
        this.slopeRelUncer = slopeRelUncer;
    }

    public Float getSlopeStandUncer() {
        return slopeStandUncer;
    }

    public void setSlopeStandUncer(Float slopeStandUncer) {
        this.slopeStandUncer = slopeStandUncer;
    }

    public Float getOrigin() {
        return origin;
    }

    public void setOrigin(Float origin) {
        this.origin = origin;
    }

    public Float getOriginRelUncer() {
        return originRelUncer;
    }

    public void setOriginRelUncer(Float originRelUncer) {
        this.originRelUncer = originRelUncer;
    }

    public Float getOriginStandUncer() {
        return originStandUncer;
    }

    public void setOriginStandUncer(Float originStandUncer) {
        this.originStandUncer = originStandUncer;
    }

    public Float getCorrelationCoefficient() {
        return correlationCoefficient;
    }

    public void setCorrelationCoefficient(Float correlationCoefficient) {
        this.correlationCoefficient = correlationCoefficient;
    }

    public Float getSpringConstant() {
        return springConstant;
    }

    public void setSpringConstant(Float springConstant) {
        this.springConstant = springConstant;
    }

    public Float getSpringConstantRelUncer() {
        return springConstantRelUncer;
    }

    public void setSpringConstantRelUncer(Float springConstantRelUncer) {
        this.springConstantRelUncer = springConstantRelUncer;
    }

    public Float getSpringConstantStandUncer() {
        return springConstantStandUncer;
    }

    public void setSpringConstantStandUncer(Float springConstantStandUncer) {
        this.springConstantStandUncer = springConstantStandUncer;
    }
}
