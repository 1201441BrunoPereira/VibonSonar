package com.SonarVibon.SonarVibon.services;

import com.SonarVibon.SonarVibon.model.Identification;
import com.SonarVibon.SonarVibon.model.IdentificationDTO;
import com.SonarVibon.SonarVibon.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class IdentificationService {

    @Autowired
    private IdentificationRepository identificationRepository;

    public List<Identification> getIdentificationByNumber(String number){
        List<Identification> list = identificationRepository.getIdentificationByNumbers(number);
        if (list.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Id not found");
        }
        return list ;
    }

    public List<Identification> getIdentificationByClass(String turma){
        List<Identification> list = identificationRepository.getIdentificationByClass(turma);
        if (list.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Id not found");
        }
        return list ;
    }

    public List<Identification> getIdentificationByGroup(String grupo){
        List<Identification> list = identificationRepository.getIdentificationByGroup(grupo);
        if (list.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Id not found");
        }
        return list ;
    }

    public List<Identification> getIdentificationByClassAndGroup(String turma, String grupo){
        List<Identification> list = identificationRepository.getIdentificationByClassAndGroup(turma,grupo);
        if (list.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Id not found");
        }
        return list ;
    }

    public Identification create(IdentificationDTO id){
        final Identification obj = Identification.newFrom(id);
        return identificationRepository.save(obj);
    }

}
