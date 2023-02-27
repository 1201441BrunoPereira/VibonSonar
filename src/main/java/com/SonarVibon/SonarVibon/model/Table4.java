package com.SonarVibon.SonarVibon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table4")
public class Table4 {

    private String open;

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String groupId ;

    @Column
    private String roomTemperature;

    @Column
    private String roomTemperatureRelUncer;

    @Column
    private String roomTemperatureStandUncer;

    @Column
    private String soundSpeedRef;

    @Column
    private String soundSpeedRefRelUncer;

    @Column
    private String soundSpeedRefStandUncer;

    @Column
    private String slope;

    private String slopeRelUncer;

    @Column
    private String slopeStandUncer;

    @Column
    private String origin;

    private String originRelUncer;

    @Column
    private String originStandUncer;

    @Column
    private String correlationCoefficient;

    @Column
    private String soundSpeedExp;

    @Column
    private String soundSpeedExpRelUncer;

    @Column
    private String soundSpeedExpStandUncer;

    @Column
    private String relativeDeviation;


    public Table4(String open, String groupId, String roomTemperature, String roomTemperatureRelUncer, String roomTemperatureStandUncer, String soundSpeedRef, String soundSpeedRefRelUncer, String soundSpeedRefStandUncer, String slope, String slopeRelUncer, String slopeStandUncer, String origin, String originRelUncer, String originStandUncer, String correlationCoefficient, String soundSpeedExp, String soundSpeedExpRelUncer, String soundSpeedExpStandUncer, String relativeDeviation) {
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

    public String getRoomTemperature() {
        return roomTemperature;
    }

    public void setRoomTemperature(String roomTemperature) {
        this.roomTemperature = roomTemperature;
    }

    public String getRoomTemperatureRelUncer() {
        return roomTemperatureRelUncer;
    }

    public void setRoomTemperatureRelUncer(String roomTemperatureRelUncer) {
        this.roomTemperatureRelUncer = roomTemperatureRelUncer;
    }

    public String getRoomTemperatureStandUncer() {
        return roomTemperatureStandUncer;
    }

    public void setRoomTemperatureStandUncer(String roomTemperatureStandUncer) {
        this.roomTemperatureStandUncer = roomTemperatureStandUncer;
    }

    public String getSoundSpeedRef() {
        return soundSpeedRef;
    }

    public void setSoundSpeedRef(String soundSpeedRef) {
        this.soundSpeedRef = soundSpeedRef;
    }

    public String getSoundSpeedRefRelUncer() {
        return soundSpeedRefRelUncer;
    }

    public void setSoundSpeedRefRelUncer(String soundSpeedRefRelUncer) {
        this.soundSpeedRefRelUncer = soundSpeedRefRelUncer;
    }

    public String getSoundSpeedRefStandUncer() {
        return soundSpeedRefStandUncer;
    }

    public void setSoundSpeedRefStandUncer(String soundSpeedRefStandUncer) {
        this.soundSpeedRefStandUncer = soundSpeedRefStandUncer;
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

    public String getSoundSpeedExp() {
        return soundSpeedExp;
    }

    public void setSoundSpeedExp(String soundSpeedExp) {
        this.soundSpeedExp = soundSpeedExp;
    }

    public String getSoundSpeedExpRelUncer() {
        return soundSpeedExpRelUncer;
    }

    public void setSoundSpeedExpRelUncer(String soundSpeedExpRelUncer) {
        this.soundSpeedExpRelUncer = soundSpeedExpRelUncer;
    }

    public String getSoundSpeedExpStandUncer() {
        return soundSpeedExpStandUncer;
    }

    public void setSoundSpeedExpStandUncer(String soundSpeedExpStandUncer) {
        this.soundSpeedExpStandUncer = soundSpeedExpStandUncer;
    }

    public String getRelativeDeviation() {
        return relativeDeviation;
    }

    public void setRelativeDeviation(String relativeDeviation) {
        this.relativeDeviation = relativeDeviation;
    }
}
