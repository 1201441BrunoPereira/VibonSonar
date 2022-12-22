package com.SonarVibon.SonarVibon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table4")
public class Table4 {

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String groupId ;

    @Column
    private Float roomTemperature;

    @Column
    private Float roomTemperatureRelUncer;

    @Column
    private Float roomTemperatureStandUncer;

    @Column
    private Float soundSpeedRef;

    @Column
    private Float soundSpeedRefRelUncer;

    @Column
    private Float soundSpeedRefStandUncer;

    @Column
    private Float slope;

    private Float slopeRelUncer;

    @Column
    private Float slopeStandUncer;

    @Column
    private Float origin;

    private Float originRelUncer;

    @Column
    private Float originStandUncer;

    @Column
    private Float correlationCoefficient;

    @Column
    private Float soundSpeedExp;

    @Column
    private Float soundSpeedExpRelUncer;

    @Column
    private Float soundSpeedExpStandUncer;

    @Column
    private Float relativeDeviation;


    public Table4(String groupId, Float roomTemperature, Float roomTemperatureRelUncer, Float roomTemperatureStandUncer, Float soundSpeedRef, Float soundSpeedRefRelUncer, Float soundSpeedRefStandUncer, Float slope, Float slopeRelUncer, Float slopeStandUncer, Float origin, Float originRelUncer, Float originStandUncer, Float correlationCoefficient, Float soundSpeedExp, Float soundSpeedExpRelUncer, Float soundSpeedExpStandUncer, Float relativeDeviation) {
        this.groupId = groupId;
        this.roomTemperature = roomTemperature;
        this.roomTemperatureRelUncer = roomTemperatureRelUncer;
        this.roomTemperatureStandUncer = roomTemperatureStandUncer;
        this.soundSpeedRef = soundSpeedRef;
        this.soundSpeedRefRelUncer = soundSpeedRefRelUncer;
        this.soundSpeedRefStandUncer = soundSpeedRefStandUncer;
        this.slope = slope;
        this.slopeRelUncer = slopeRelUncer;
        this.slopeStandUncer = slopeStandUncer;
        this.origin = origin;
        this.originRelUncer = originRelUncer;
        this.originStandUncer = originStandUncer;
        this.correlationCoefficient = correlationCoefficient;
        this.soundSpeedExp = soundSpeedExp;
        this.soundSpeedExpRelUncer = soundSpeedExpRelUncer;
        this.soundSpeedExpStandUncer = soundSpeedExpStandUncer;
        this.relativeDeviation = relativeDeviation;
    }

    public Table4() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Float getRoomTemperature() {
        return roomTemperature;
    }

    public void setRoomTemperature(Float roomTemperature) {
        this.roomTemperature = roomTemperature;
    }

    public Float getRoomTemperatureRelUncer() {
        return roomTemperatureRelUncer;
    }

    public void setRoomTemperatureRelUncer(Float roomTemperatureRelUncer) {
        this.roomTemperatureRelUncer = roomTemperatureRelUncer;
    }

    public Float getRoomTemperatureStandUncer() {
        return roomTemperatureStandUncer;
    }

    public void setRoomTemperatureStandUncer(Float roomTemperatureStandUncer) {
        this.roomTemperatureStandUncer = roomTemperatureStandUncer;
    }

    public Float getSoundSpeedRef() {
        return soundSpeedRef;
    }

    public void setSoundSpeedRef(Float soundSpeedRef) {
        this.soundSpeedRef = soundSpeedRef;
    }

    public Float getSoundSpeedRefRelUncer() {
        return soundSpeedRefRelUncer;
    }

    public void setSoundSpeedRefRelUncer(Float soundSpeedRefRelUncer) {
        this.soundSpeedRefRelUncer = soundSpeedRefRelUncer;
    }

    public Float getSoundSpeedRefStandUncer() {
        return soundSpeedRefStandUncer;
    }

    public void setSoundSpeedRefStandUncer(Float soundSpeedRefStandUncer) {
        this.soundSpeedRefStandUncer = soundSpeedRefStandUncer;
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

    public Float getSoundSpeedExp() {
        return soundSpeedExp;
    }

    public void setSoundSpeedExp(Float soundSpeedExp) {
        this.soundSpeedExp = soundSpeedExp;
    }

    public Float getSoundSpeedExpRelUncer() {
        return soundSpeedExpRelUncer;
    }

    public void setSoundSpeedExpRelUncer(Float soundSpeedExpRelUncer) {
        this.soundSpeedExpRelUncer = soundSpeedExpRelUncer;
    }

    public Float getSoundSpeedExpStandUncer() {
        return soundSpeedExpStandUncer;
    }

    public void setSoundSpeedExpStandUncer(Float soundSpeedExpStandUncer) {
        this.soundSpeedExpStandUncer = soundSpeedExpStandUncer;
    }

    public Float getRelativeDeviation() {
        return relativeDeviation;
    }

    public void setRelativeDeviation(Float relativeDeviation) {
        this.relativeDeviation = relativeDeviation;
    }
}
