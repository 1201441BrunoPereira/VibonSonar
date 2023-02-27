package com.SonarVibon.SonarVibon.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table6")
public class Table6 {

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
    private String totalMass;

    @Column
    private String totalMassRelUncer;

    @Column
    private String totalMassStandUncer;

    @Column
    private String distance;

    @Column
    private String distanceRelUncer;

    @Column
    private String distanceStandUncer;

    @Column
    private String tZeros;

    @Column
    private String tZerosRelUncer;

    @Column
    private String tZerosStandUncer;

    @Column
    private String tPeaks;

    @Column
    private String tPeaksRelUncer;

    @Column
    private String tPeaksStandUncer;

    @Column
    private String relativeDeviation;

    @Column
    private String damping;

    @Column
    private String dampingRelUncer;

    @Column
    private String dampingStandUncer;

    @Column
    private String ownFrequency;

    @Column
    private String ownFrequencyRelUncer;

    @Column
    private String ownFrequencyStandUncer;

    @Column
    private String oscillationFrequency;

    @Column
    private String oscillationFrequencyRelUncer;

    @Column
    private String oscillationFrequencyStandUncer;

    @Column
    private String oscillationPeriod;

    @Column
    private String oscillationPeriodRelUncer;

    @Column
    private String oscillationPeriodStandUncer;

    @Column
    private String qualityFactor;

    @Column
    private String qualityFactorRelUncer;

    @Column
    private String qualityFactorStandUncer;

    @Column
    private String decay;

    @Column
    private String decayRelUncer;

    @Column
    private String decayStandUncer;

    public Table6(String open, String groupId, String mass, String massRelUncer, String massStandUncer, String totalMass, String totalMassRelUncer, String totalMassStandUncer, String distance, String distanceRelUncer, String distanceStandUncer, String tZeros, String tZerosRelUncer, String tZerosStandUncer, String tPeaks, String tPeaksRelUncer, String tPeaksStandUncer, String relativeDeviation, String damping, String dampingRelUncer, String dampingStandUncer, String ownFrequency, String ownFrequencyRelUncer, String ownFrequencyStandUncer, String oscillationFrequency, String oscillationFrequencyRelUncer, String oscillationFrequencyStandUncer, String oscillationPeriod, String oscillationPeriodRelUncer, String oscillationPeriodStandUncer, String qualityFactor, String qualityFactorRelUncer, String qualityFactorStandUncer, String decay, String decayRelUncer, String decayStandUncer) {
        this.open = open;
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

    public String getTotalMass() {
        return totalMass;
    }

    public void setTotalMass(String totalMass) {
        this.totalMass = totalMass;
    }

    public String getTotalMassRelUncer() {
        return totalMassRelUncer;
    }

    public void setTotalMassRelUncer(String totalMassRelUncer) {
        this.totalMassRelUncer = totalMassRelUncer;
    }

    public String getTotalMassStandUncer() {
        return totalMassStandUncer;
    }

    public void setTotalMassStandUncer(String totalMassStandUncer) {
        this.totalMassStandUncer = totalMassStandUncer;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDistanceRelUncer() {
        return distanceRelUncer;
    }

    public void setDistanceRelUncer(String distanceRelUncer) {
        this.distanceRelUncer = distanceRelUncer;
    }

    public String getDistanceStandUncer() {
        return distanceStandUncer;
    }

    public void setDistanceStandUncer(String distanceStandUncer) {
        this.distanceStandUncer = distanceStandUncer;
    }

    public String gettZeros() {
        return tZeros;
    }

    public void settZeros(String tZeros) {
        this.tZeros = tZeros;
    }

    public String gettZerosRelUncer() {
        return tZerosRelUncer;
    }

    public void settZerosRelUncer(String tZerosRelUncer) {
        this.tZerosRelUncer = tZerosRelUncer;
    }

    public String gettZerosStandUncer() {
        return tZerosStandUncer;
    }

    public void settZerosStandUncer(String tZerosStandUncer) {
        this.tZerosStandUncer = tZerosStandUncer;
    }

    public String gettPeaks() {
        return tPeaks;
    }

    public void settPeaks(String tPeaks) {
        this.tPeaks = tPeaks;
    }

    public String gettPeaksRelUncer() {
        return tPeaksRelUncer;
    }

    public void settPeaksRelUncer(String tPeaksRelUncer) {
        this.tPeaksRelUncer = tPeaksRelUncer;
    }

    public String gettPeaksStandUncer() {
        return tPeaksStandUncer;
    }

    public void settPeaksStandUncer(String tPeaksStandUncer) {
        this.tPeaksStandUncer = tPeaksStandUncer;
    }

    public String getRelativeDeviation() {
        return relativeDeviation;
    }

    public void setRelativeDeviation(String relativeDeviation) {
        this.relativeDeviation = relativeDeviation;
    }

    public String getDamping() {
        return damping;
    }

    public void setDamping(String damping) {
        this.damping = damping;
    }

    public String getDampingRelUncer() {
        return dampingRelUncer;
    }

    public void setDampingRelUncer(String dampingRelUncer) {
        this.dampingRelUncer = dampingRelUncer;
    }

    public String getDampingStandUncer() {
        return dampingStandUncer;
    }

    public void setDampingStandUncer(String dampingStandUncer) {
        this.dampingStandUncer = dampingStandUncer;
    }

    public String getOwnFrequency() {
        return ownFrequency;
    }

    public void setOwnFrequency(String ownFrequency) {
        this.ownFrequency = ownFrequency;
    }

    public String getOwnFrequencyRelUncer() {
        return ownFrequencyRelUncer;
    }

    public void setOwnFrequencyRelUncer(String ownFrequencyRelUncer) {
        this.ownFrequencyRelUncer = ownFrequencyRelUncer;
    }

    public String getOwnFrequencyStandUncer() {
        return ownFrequencyStandUncer;
    }

    public void setOwnFrequencyStandUncer(String ownFrequencyStandUncer) {
        this.ownFrequencyStandUncer = ownFrequencyStandUncer;
    }

    public String getOscillationFrequency() {
        return oscillationFrequency;
    }

    public void setOscillationFrequency(String oscillationFrequency) {
        this.oscillationFrequency = oscillationFrequency;
    }

    public String getOscillationFrequencyRelUncer() {
        return oscillationFrequencyRelUncer;
    }

    public void setOscillationFrequencyRelUncer(String oscillationFrequencyRelUncer) {
        this.oscillationFrequencyRelUncer = oscillationFrequencyRelUncer;
    }

    public String getOscillationFrequencyStandUncer() {
        return oscillationFrequencyStandUncer;
    }

    public void setOscillationFrequencyStandUncer(String oscillationFrequencyStandUncer) {
        this.oscillationFrequencyStandUncer = oscillationFrequencyStandUncer;
    }

    public String getOscillationPeriod() {
        return oscillationPeriod;
    }

    public void setOscillationPeriod(String oscillationPeriod) {
        this.oscillationPeriod = oscillationPeriod;
    }

    public String getOscillationPeriodRelUncer() {
        return oscillationPeriodRelUncer;
    }

    public void setOscillationPeriodRelUncer(String oscillationPeriodRelUncer) {
        this.oscillationPeriodRelUncer = oscillationPeriodRelUncer;
    }

    public String getOscillationPeriodStandUncer() {
        return oscillationPeriodStandUncer;
    }

    public void setOscillationPeriodStandUncer(String oscillationPeriodStandUncer) {
        this.oscillationPeriodStandUncer = oscillationPeriodStandUncer;
    }

    public String getQualityFactor() {
        return qualityFactor;
    }

    public void setQualityFactor(String qualityFactor) {
        this.qualityFactor = qualityFactor;
    }

    public String getQualityFactorRelUncer() {
        return qualityFactorRelUncer;
    }

    public void setQualityFactorRelUncer(String qualityFactorRelUncer) {
        this.qualityFactorRelUncer = qualityFactorRelUncer;
    }

    public String getQualityFactorStandUncer() {
        return qualityFactorStandUncer;
    }

    public void setQualityFactorStandUncer(String qualityFactorStandUncer) {
        this.qualityFactorStandUncer = qualityFactorStandUncer;
    }

    public String getDecay() {
        return decay;
    }

    public void setDecay(String decay) {
        this.decay = decay;
    }

    public String getDecayRelUncer() {
        return decayRelUncer;
    }

    public void setDecayRelUncer(String decayRelUncer) {
        this.decayRelUncer = decayRelUncer;
    }

    public String getDecayStandUncer() {
        return decayStandUncer;
    }

    public void setDecayStandUncer(String decayStandUncer) {
        this.decayStandUncer = decayStandUncer;
    }
}
