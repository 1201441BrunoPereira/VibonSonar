package com.SonarVibon.SonarVibon.services;

import com.SonarVibon.SonarVibon.model.Identification;
import com.SonarVibon.SonarVibon.model.IdentificationDTO;
import com.SonarVibon.SonarVibon.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IdentificationService {

    @Autowired
    private IdentificationRepository identificationRepository;

    public List<Identification> getIdentificationByNumber(String number){
        return identificationRepository.getIdentificationByNumbers(number);
    }

    public Identification create(IdentificationDTO id){
        final Identification obj = Identification.newFrom(id);
        return identificationRepository.save(obj);
    }

}
