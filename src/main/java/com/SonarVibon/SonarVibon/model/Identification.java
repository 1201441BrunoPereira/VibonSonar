package com.SonarVibon.SonarVibon.model;

import net.bytebuddy.utility.nullability.MaybeNull;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "identification")
public class Identification {

    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String groupId ;

    @Column(nullable = false)
    private String numbers;

    @Column()
    private String name1;

    @Column()
    private String name2;

    @Column()
    private String name3;

    @Column()
    private String name4;

    @Column()
    @MaybeNull
    private String numberFromName1;

    @Column()
    @MaybeNull
    private String numberFromName2;

    @Column()
    @MaybeNull
    private String numberFromName3;

    @Column()
    @MaybeNull
    private String numberFromName4;

    @Column(nullable = false)
    private String turma;

    @Column(nullable = false)
    private String grupo;

    @Column(nullable = false)
    private LocalDate data;

    public Identification(String groupId, String numbers, String name1, String name2, String name3, String name4, @MaybeNull String numberFromName1, @MaybeNull String numberFromName2, @MaybeNull String numberFromName3, @MaybeNull String numberFromName4, String turma, String grupo, LocalDate data) {
        this.groupId = groupId;
        this.numbers = numbers;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.numberFromName1 = numberFromName1;
        this.numberFromName2 = numberFromName2;
        this.numberFromName3 = numberFromName3;
        this.numberFromName4 = numberFromName4;
        this.turma = turma;
        this.grupo = grupo;
        this.data = data;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    public Identification() {
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers() {
        this.numbers = getNumberFromName1()+"_"+getNumberFromName2()+"_"+getNumberFromName3()+"_"+getNumberFromName4();
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getNumberFromName1() {
        return numberFromName1;
    }

    public void setNumberFromName1(String numberFromName1) {
        if (numberFromName1 != null && getName1() != null) {
            if (numberFromName1.length() != 7 || !numberFromName1.matches("[0-9]+")) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number don't have the correct format");
            }
        } else if((numberFromName1 == null && getName1() != null)|| (numberFromName1 != null && getName1() == null)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number and Name must be both fulfilled");
        }
        this.numberFromName1 = numberFromName1;
    }

    public String getNumberFromName2() {
        return numberFromName2;
    }

    public void setNumberFromName2(String numberFromName2) {
        if (numberFromName2 != null && getName2() != null) {
            if (numberFromName2.length() != 7 || !numberFromName2.matches("[0-9]+")) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number don't have the correct format");
            }
        } else if((numberFromName2 == null && getName2() != null)|| (numberFromName2 != null && getName2() == null)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number and Name must be both fulfilled");
        }
        this.numberFromName2 = numberFromName2;
    }

    public String getNumberFromName3() {
        return numberFromName3;
    }

    public void setNumberFromName3(String numberFromName3) {
        if (numberFromName3 != null && getName3() != null) {
            if (numberFromName3.length() != 7 || !numberFromName3.matches("[0-9]+")) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number don't have the correct format");
            }
        } else if((numberFromName3 == null && getName3() != null)|| (numberFromName3 != null && getName3() == null)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number and Name must be both fulfilled");
        }
        this.numberFromName3 = numberFromName3;
    }

    public String getNumberFromName4() {
        return numberFromName4;
    }

    public void setNumberFromName4(String numberFromName4) {
        if (numberFromName4 != null && getName4() != null) {
            if (numberFromName4.length() != 7 || !numberFromName4.matches("[0-9]+")) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number don't have the correct format");
            }
        } else if((numberFromName4 == null && getName4() != null)|| (numberFromName4 != null && getName4() == null)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Number and Name must be both fulfilled");
        }
        this.numberFromName4 = numberFromName4;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public LocalDate  getData() {
        return data;
    }

    public void setData(LocalDate  data) {
        this.data = data;
    }

    public static String generateUUID(){
        UUID Uuid = UUID.randomUUID();
        String groupId = Uuid.toString();
        return  groupId;
    }

    public static Identification newFrom(final IdentificationDTO id){
        final Identification obj = new Identification();
        obj.setGroupId(generateUUID());
        obj.setName1(id.getName1());
        obj.setName2(id.getName2());
        obj.setName3(id.getName3());
        obj.setName4(id.getName4());
        obj.setNumberFromName1(id.getNumberFromName1());
        obj.setNumberFromName2(id.getNumberFromName2());
        obj.setNumberFromName3(id.getNumberFromName3());
        obj.setNumberFromName4(id.getNumberFromName4());
        obj.setNumbers();
        obj.setGrupo(id.getGrupo());
        obj.setTurma(id.getTurma());
        obj.setData(LocalDate.now());
        return obj;
    }

}
