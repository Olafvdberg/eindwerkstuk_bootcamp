package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;

import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Reperation;
import com.novi.eindwerkstuk.repository.ReperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReperationServiceImpl implements ReperationService {
    @Autowired
    ReperationRepository reperationRepository;

    @Override
    public List<Reperation> getAllReperations(){
        return reperationRepository.findAll();
    }

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
    public List<Reperation> getReperationByReperation(String to_do_reperation) {
        if (to_do_reperation == null || to_do_reperation.isEmpty())
            return reperationRepository.findAll();
        else
            return reperationRepository.findByStatusStartingWithOrderByStatus(to_do_reperation);
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
            existingReperation.setStatus(reperation.getStatus());
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
