package com.SonarVibon.SonarVibon.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table6")
public class Table6 {

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
    private Float totalMass;

    @Column
    private Float totalMassRelUncer;

    @Column
    private Float totalMassStandUncer;

    @Column
    private Float distance;

    @Column
    private Float distanceRelUncer;

    @Column
    private Float distanceStandUncer;

    @Column
    private Float tZeros;

    @Column
    private Float tZerosRelUncer;

    @Column
    private Float tZerosStandUncer;

    @Column
    private Float tPeaks;

    @Column
    private Float tPeaksRelUncer;

    @Column
    private Float tPeaksStandUncer;

    @Column
    private Float relativeDeviation;

    @Column
    private Float damping;

    @Column
    private Float dampingRelUncer;

    @Column
    private Float dampingStandUncer;

    @Column
    private Float ownFrequency;

    @Column
    private Float ownFrequencyRelUncer;

    @Column
    private Float ownFrequencyStandUncer;

    @Column
    private Float oscillationFrequency;

    @Column
    private Float oscillationFrequencyRelUncer;

    @Column
    private Float oscillationFrequencyStandUncer;

    @Column
    private Float oscillationPeriod;

    @Column
    private Float oscillationPeriodRelUncer;

    @Column
    private Float oscillationPeriodStandUncer;

    @Column
    private Float qualityFactor;

    @Column
    private Float qualityFactorRelUncer;

    @Column
    private Float qualityFactorStandUncer;

    @Column
    private Float decay;

    @Column
    private Float decayRelUncer;

    @Column
    private Float decayStandUncer;

    public Table6(String groupId, Float mass, Float massRelUncer, Float massStandUncer, Float totalMass, Float totalMassRelUncer, Float totalMassStandUncer, Float distance, Float distanceRelUncer, Float distanceStandUncer, Float tZeros, Float tZerosRelUncer, Float tZerosStandUncer, Float tPeaks, Float tPeaksRelUncer, Float tPeaksStandUncer, Float relativeDeviation, Float damping, Float dampingRelUncer, Float dampingStandUncer, Float ownFrequency, Float ownFrequencyRelUncer, Float ownFrequencyStandUncer, Float oscillationFrequency, Float oscillationFrequencyRelUncer, Float oscillationFrequencyStandUncer, Float oscillationPeriod, Float oscillationPeriodRelUncer, Float oscillationPeriodStandUncer, Float qualityFactor, Float qualityFactorRelUncer, Float qualityFactorStandUncer, Float decay, Float decayRelUncer, Float decayStandUncer) {
        this.groupId = groupId;
        this.mass = mass;
        this.massRelUncer = massRelUncer;
        this.massStandUncer = massStandUncer;
        this.totalMass = totalMass;
        this.totalMassRelUncer = totalMassRelUncer;
        this.totalMassStandUncer = totalMassStandUncer;
        this.distance = distance;
        this.distanceRelUncer = distanceRelUncer;
        this.distanceStandUncer = distanceStandUncer;
        this.tZeros = tZeros;
        this.tZerosRelUncer = tZerosRelUncer;
        this.tZerosStandUncer = tZerosStandUncer;
        this.tPeaks = tPeaks;
        this.tPeaksRelUncer = tPeaksRelUncer;
        this.tPeaksStandUncer = tPeaksStandUncer;
        this.relativeDeviation = relativeDeviation;
        this.damping = damping;
        this.dampingRelUncer = dampingRelUncer;
        this.dampingStandUncer = dampingStandUncer;
        this.ownFrequency = ownFrequency;
        this.ownFrequencyRelUncer = ownFrequencyRelUncer;
        this.ownFrequencyStandUncer = ownFrequencyStandUncer;
        this.oscillationFrequency = oscillationFrequency;
        this.oscillationFrequencyRelUncer = oscillationFrequencyRelUncer;
        this.oscillationFrequencyStandUncer = oscillationFrequencyStandUncer;
        this.oscillationPeriod = oscillationPeriod;
        this.oscillationPeriodRelUncer = oscillationPeriodRelUncer;
        this.oscillationPeriodStandUncer = oscillationPeriodStandUncer;
        this.qualityFactor = qualityFactor;
        this.qualityFactorRelUncer = qualityFactorRelUncer;
        this.qualityFactorStandUncer = qualityFactorStandUncer;
        this.decay = decay;
        this.decayRelUncer = decayRelUncer;
        this.decayStandUncer = decayStandUncer;
    }

    public Table6() {
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

    public Float getTotalMass() {
        return totalMass;
    }

    public void setTotalMass(Float totalMass) {
        this.totalMass = totalMass;
    }

    public Float getTotalMassRelUncer() {
        return totalMassRelUncer;
    }

    public void setTotalMassRelUncer(Float totalMassRelUncer) {
        this.totalMassRelUncer = totalMassRelUncer;
    }

    public Float getTotalMassStandUncer() {
        return totalMassStandUncer;
    }

    public void setTotalMassStandUncer(Float totalMassStandUncer) {
        this.totalMassStandUncer = totalMassStandUncer;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getDistanceRelUncer() {
        return distanceRelUncer;
    }

    public void setDistanceRelUncer(Float distanceRelUncer) {
        this.distanceRelUncer = distanceRelUncer;
    }

    public Float getDistanceStandUncer() {
        return distanceStandUncer;
    }

    public void setDistanceStandUncer(Float distanceStandUncer) {
        this.distanceStandUncer = distanceStandUncer;
    }

    public Float gettZeros() {
        return tZeros;
    }

    public void settZeros(Float tZeros) {
        this.tZeros = tZeros;
    }

    public Float gettZerosRelUncer() {
        return tZerosRelUncer;
    }

    public void settZerosRelUncer(Float tZerosRelUncer) {
        this.tZerosRelUncer = tZerosRelUncer;
    }

    public Float gettZerosStandUncer() {
        return tZerosStandUncer;
    }

    public void settZerosStandUncer(Float tZerosStandUncer) {
        this.tZerosStandUncer = tZerosStandUncer;
    }

    public Float gettPeaks() {
        return tPeaks;
    }

    public void settPeaks(Float tPeaks) {
        this.tPeaks = tPeaks;
    }

    public Float gettPeaksRelUncer() {
        return tPeaksRelUncer;
    }

    public void settPeaksRelUncer(Float tPeaksRelUncer) {
        this.tPeaksRelUncer = tPeaksRelUncer;
    }

    public Float gettPeaksStandUncer() {
        return tPeaksStandUncer;
    }

    public void settPeaksStandUncer(Float tPeaksStandUncer) {
        this.tPeaksStandUncer = tPeaksStandUncer;
    }

    public Float getRelativeDeviation() {
        return relativeDeviation;
    }

    public void setRelativeDeviation(Float relativeDeviation) {
        this.relativeDeviation = relativeDeviation;
    }

    public Float getDamping() {
        return damping;
    }

    public void setDamping(Float damping) {
        this.damping = damping;
    }

    public Float getDampingRelUncer() {
        return dampingRelUncer;
    }

    public void setDampingRelUncer(Float dampingRelUncer) {
        this.dampingRelUncer = dampingRelUncer;
    }

    public Float getDampingStandUncer() {
        return dampingStandUncer;
    }

    public void setDampingStandUncer(Float dampingStandUncer) {
        this.dampingStandUncer = dampingStandUncer;
    }

    public Float getOwnFrequency() {
        return ownFrequency;
    }

    public void setOwnFrequency(Float ownFrequency) {
        this.ownFrequency = ownFrequency;
    }

    public Float getOwnFrequencyRelUncer() {
        return ownFrequencyRelUncer;
    }

    public void setOwnFrequencyRelUncer(Float ownFrequencyRelUncer) {
        this.ownFrequencyRelUncer = ownFrequencyRelUncer;
    }

    public Float getOwnFrequencyStandUncer() {
        return ownFrequencyStandUncer;
    }

    public void setOwnFrequencyStandUncer(Float ownFrequencyStandUncer) {
        this.ownFrequencyStandUncer = ownFrequencyStandUncer;
    }

    public Float getOscillationFrequency() {
        return oscillationFrequency;
    }

    public void setOscillationFrequency(Float oscillationFrequency) {
        this.oscillationFrequency = oscillationFrequency;
    }

    public Float getOscillationFrequencyRelUncer() {
        return oscillationFrequencyRelUncer;
    }

    public void setOscillationFrequencyRelUncer(Float oscillationFrequencyRelUncer) {
        this.oscillationFrequencyRelUncer = oscillationFrequencyRelUncer;
    }

    public Float getOscillationFrequencyStandUncer() {
        return oscillationFrequencyStandUncer;
    }

    public void setOscillationFrequencyStandUncer(Float oscillationFrequencyStandUncer) {
        this.oscillationFrequencyStandUncer = oscillationFrequencyStandUncer;
    }

    public Float getOscillationPeriod() {
        return oscillationPeriod;
    }

    public void setOscillationPeriod(Float oscillationPeriod) {
        this.oscillationPeriod = oscillationPeriod;
    }

    public Float getOscillationPeriodRelUncer() {
        return oscillationPeriodRelUncer;
    }

    public void setOscillationPeriodRelUncer(Float oscillationPeriodRelUncer) {
        this.oscillationPeriodRelUncer = oscillationPeriodRelUncer;
    }

    public Float getOscillationPeriodStandUncer() {
        return oscillationPeriodStandUncer;
    }

    public void setOscillationPeriodStandUncer(Float oscillationPeriodStandUncer) {
        this.oscillationPeriodStandUncer = oscillationPeriodStandUncer;
    }

    public Float getQualityFactor() {
        return qualityFactor;
    }

    public void setQualityFactor(Float qualityFactor) {
        this.qualityFactor = qualityFactor;
    }

    public Float getQualityFactorRelUncer() {
        return qualityFactorRelUncer;
    }

    public void setQualityFactorRelUncer(Float qualityFactorRelUncer) {
        this.qualityFactorRelUncer = qualityFactorRelUncer;
    }

    public Float getQualityFactorStandUncer() {
        return qualityFactorStandUncer;
    }

    public void setQualityFactorStandUncer(Float qualityFactorStandUncer) {
        this.qualityFactorStandUncer = qualityFactorStandUncer;
    }

    public Float getDecay() {
        return decay;
    }

    public void setDecay(Float decay) {
        this.decay = decay;
    }

    public Float getDecayRelUncer() {
        return decayRelUncer;
    }

    public void setDecayRelUncer(Float decayRelUncer) {
        this.decayRelUncer = decayRelUncer;
    }

    public Float getDecayStandUncer() {
        return decayStandUncer;
    }

    public void setDecayStandUncer(Float decayStandUncer) {
        this.decayStandUncer = decayStandUncer;
    }
}
