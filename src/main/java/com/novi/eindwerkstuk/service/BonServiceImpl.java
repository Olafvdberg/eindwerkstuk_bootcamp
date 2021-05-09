package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Bon;
import com.novi.eindwerkstuk.repository.BonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonServiceImpl implements BonService{
    @Autowired
    BonRepository bonRepository;

    @Override
    public Bon getBonById(long id) {
        if (bonRepository.existsById(id)) {
            return bonRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateBon(long id, Bon bon) {
        if (bonRepository.existsById(id)) {
            Bon existingBon = bonRepository.findById(id).get();
            existingBon.setStatus(bon.getStatus());
            existingBon.setAction(bon.getAction());
            existingBon.setApk(bon.getApk());
            existingBon.setCustomer(bon.getCustomer());
            existingBon.setPart(bon.getPart());
            existingBon.setCar(bon.getCar());
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
