package com.SonarVibon.SonarVibon.services;

import com.SonarVibon.SonarVibon.model.*;
import com.SonarVibon.SonarVibon.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfService {

    @Autowired
    private Table1Repository repository1;

    @Autowired
    private Table2Repository repository2;

    @Autowired
    private Table3Repository repository3;

    @Autowired
    private Table4Repository repository4;

    @Autowired
    private Table5Repository repository5;

    @Autowired
    private Table6Repository repository6;

    @Autowired
    private IdentificationRepository identificationRepository;


    public void changeAllStatusOpen(String turma, String table, boolean status){

        if (table.equals("all")) {

            List<Identification> list = identificationRepository.getIdentificationByClass(turma);

            String lastStatus;

            if (status){
                lastStatus = "OPEN";
            }else {
                lastStatus = "CLOSED";
            }

            for (Identification identification : list) {
                Table1 table1 = repository1.getTable1ByGroupId(identification.getGroupId());
                Table2 table2 = repository2.getCalibrationDataByGroupId(identification.getGroupId());
                Table3 table3 = repository3.getHookeLawDataByGroupId(identification.getGroupId());
                Table4 table4 = repository4.getTable4ByGroupId(identification.getGroupId());
                Table5 table5 = repository5.getTable5ByGroupId(identification.getGroupId());
                Table6 table6 = repository6.getTable6ByGroupId(identification.getGroupId());

                if (table1 == null){
                    Table1 table11 = new Table1(lastStatus,identification.getGroupId(),"","","","","","");
                    repository1.save(table11);
                }else {
                    table1.setOpen(lastStatus);
                    repository1.save(table1);
                }
                if (table2 == null){
                    Table2 table22 = new Table2(lastStatus,identification.getGroupId(),"","","","","","","","","","","","","","","","","","","","","","","","");
                    repository2.save(table22);
                }else {
                    table2.setOpen(lastStatus);
                    repository2.save(table2);
                }
                if (table3 == null){
                    Table3 table33 = new Table3(lastStatus,identification.getGroupId(),"","","","","","","","","","","","","","","","","","","","","","","","");
                    repository3.save(table33);
                }else{
                    table3.setOpen(lastStatus);
                    repository3.save(table3);
                }
                if (table4 == null){
                    Table4 table44 = new Table4(lastStatus,identification.getGroupId(),"","","","","","","","","","","","","","","","","");
                    repository4.save(table44);
                }else{
                    table4.setOpen(lastStatus);
                    repository4.save(table4);
                }
                if (table5 == null){
                    Table5 table55 = new Table5(lastStatus,identification.getGroupId(),"","","","","","","","","","","","","","","","");
                    repository5.save(table55);
                }else{
                    table5.setOpen(lastStatus);
                    repository5.save(table5);
                }
                if (table6 == null){
                    Table6 table66 = new Table6(lastStatus,identification.getGroupId(),"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","");
                    repository6.save(table66);
                }else{
                    table6.setOpen(lastStatus);
                    repository6.save(table6);
                }
            }
        }else{
            if (table.equals("tabela1")) {
                if (status) {
                    List<Table1> table1 = repository1.getAllOpen("CLOSED");
                    for (Table1 t : table1) {
                        t.setOpen("OPEN");
                        repository1.save(t);
                    }
                } else {
                    List<Table1> table1 = repository1.getAllOpen("OPEN");
                    for (Table1 t : table1) {
                        t.setOpen("CLOSED");
                        repository1.save(t);
                    }
                }
            }
            if (table.equals("tabela2")) {
                if (status) {
                    List<Table2> table2 = repository2.getAllOpen("CLOSED");
                    for (Table2 t : table2) {
                        t.setOpen("OPEN");
                        repository2.save(t);
                    }
                } else {
                    List<Table2> table2 = repository2.getAllOpen("OPEN");
                    for (Table2 t : table2) {
                        t.setOpen("CLOSED");
                        repository2.save(t);
                    }
                }
            }
            if (table.equals("tabela3")) {
                if (status) {
                    List<Table3> table3 = repository3.getAllOpen("CLOSED");
                    for (Table3 t : table3) {
                        t.setOpen("OPEN");
                        repository3.save(t);
                    }
                } else {
                    List<Table3> table3 = repository3.getAllOpen("OPEN");
                    for (Table3 t : table3) {
                        t.setOpen("CLOSED");
                        repository3.save(t);
                    }
                }
            }
            if (table.equals("tabela4")) {
                if (status) {
                    List<Table4> table4 = repository4.getAllOpen("CLOSED");
                    for (Table4 t : table4) {
                        t.setOpen("OPEN");
                        repository4.save(t);
                    }
                } else {
                    List<Table4> table4 = repository4.getAllOpen("OPEN");
                    for (Table4 t : table4) {
                        t.setOpen("CLOSED");
                        repository4.save(t);
                    }
                }
            }
            if (table.equals("tabela5")) {
                if (status) {
                    List<Table5> table5 = repository5.getAllOpen("CLOSED");
                    for (Table5 t : table5) {
                        t.setOpen("OPEN");
                        repository5.save(t);
                    }
                } else {
                    List<Table5> table5 = repository5.getAllOpen("OPEN");
                    for (Table5 t : table5) {
                        t.setOpen("CLOSED");
                        repository5.save(t);
                    }
                }
            }
            if (table.equals("tabela6")) {
                if (status) {
                    List<Table6> table6 = repository6.getAllOpen("CLOSED");
                    for (Table6 t : table6) {
                        t.setOpen("OPEN");
                        repository6.save(t);
                    }
                } else {
                    List<Table6> table6 = repository6.getAllOpen("OPEN");
                    for (Table6 t : table6) {
                        t.setOpen("CLOSED");
                        repository6.save(t);
                    }
                }
            }
        }
    }
}
