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
    @Column(name = "ID",nullable = false, length = 36)
    private String groupId;

    @Column
    private String open;

    @Column
    private String d1;
    @Column
    private String d2;
    @Column
    private String d3;
    @Column
    private String d4;
    @Column
    private String d5;
    @Column
    private String d6;
    @Column
    private String d7;
    @Column
    private String d8;
    @Column
    private String d9;
    @Column
    private String d10;
    @Column
    private String d11;
    @Column
    private String d12;

    @Column
    private String t1;
    @Column
    private String t2;
    @Column
    private String t3;
    @Column
    private String t4;
    @Column
    private String t5;
    @Column
    private String t6;
    @Column
    private String t7;
    @Column
    private String t8;
    @Column
    private String t9;
    @Column
    private String t10;
    @Column
    private String t11;
    @Column
    private String t12;


    public Table2(String groupId, String open, String d1, String d2, String d3, String d4, String d5, String d6, String d7, String d8, String d9, String d10, String d11, String d12, String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9, String t10, String t11, String t12) {
        this.groupId = groupId;
        this.open = open;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
        this.d11 = d11;
        this.d12 = d12;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        this.t6 = t6;
        this.t7 = t7;
        this.t8 = t8;
        this.t9 = t9;
        this.t10 = t10;
        this.t11 = t11;
        this.t12 = t12;
    }

    public Table2() {
    }

    public static String generateUUID(){
        UUID Uuid = UUID.randomUUID();
        return Uuid.toString();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId() {
        this.groupId = generateUUID();
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getD4() {
        return d4;
    }

    public void setD4(String d4) {
        this.d4 = d4;
    }

    public String getD5() {
        return d5;
    }

    public void setD5(String d5) {
        this.d5 = d5;
    }

    public String getD6() {
        return d6;
    }

    public void setD6(String d6) {
        this.d6 = d6;
    }

    public String getD7() {
        return d7;
    }

    public void setD7(String d7) {
        this.d7 = d7;
    }

    public String getD8() {
        return d8;
    }

    public void setD8(String d8) {
        this.d8 = d8;
    }

    public String getD9() {
        return d9;
    }

    public void setD9(String d9) {
        this.d9 = d9;
    }

    public String getD10() {
        return d10;
    }

    public void setD10(String d10) {
        this.d10 = d10;
    }

    public String getD11() {
        return d11;
    }

    public void setD11(String d11) {
        this.d11 = d11;
    }

    public String getD12() {
        return d12;
    }

    public void setD12(String d12) {
        this.d12 = d12;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getT4() {
        return t4;
    }

    public void setT4(String t4) {
        this.t4 = t4;
    }

    public String getT5() {
        return t5;
    }

    public void setT5(String t5) {
        this.t5 = t5;
    }

    public String getT6() {
        return t6;
    }

    public void setT6(String t6) {
        this.t6 = t6;
    }

    public String getT7() {
        return t7;
    }

    public void setT7(String t7) {
        this.t7 = t7;
    }

    public String getT8() {
        return t8;
    }

    public void setT8(String t8) {
        this.t8 = t8;
    }

    public String getT9() {
        return t9;
    }

    public void setT9(String t9) {
        this.t9 = t9;
    }

    public String getT10() {
        return t10;
    }

    public void setT10(String t10) {
        this.t10 = t10;
    }

    public String getT11() {
        return t11;
    }

    public void setT11(String t11) {
        this.t11 = t11;
    }

    public String getT12() {
        return t12;
    }

    public void setT12(String t12) {
        this.t12 = t12;
    }
}
