package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;

import com.novi.eindwerkstuk.model.Reperation;
import com.novi.eindwerkstuk.repository.ReperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReperationServiceImpl implements ReperationService {
    @Autowired
    ReperationRepository reperationRepository;

    @Override
    public Reperation getReperationById(long id) {
        if (reperationRepository.existsById(id)) {
            return reperationRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addReperation(Reperation reperation) {
        Reperation newReperation = reperationRepository.save(reperation);
        return newReperation.getReperation_id();
    }

    @Override
    public void deleteReperation(long id) {
        if (reperationRepository.existsById(id)) {
            reperationRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateReperation(long id, Reperation reperation) {
        if (reperationRepository.existsById(id)) {
            Reperation existingReperation = reperationRepository.findById(id).get();
            existingReperation.setReperation_date(reperation.getReperation_date());
            existingReperation.setTo_do_reperation(reperation.getTo_do_reperation());
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
