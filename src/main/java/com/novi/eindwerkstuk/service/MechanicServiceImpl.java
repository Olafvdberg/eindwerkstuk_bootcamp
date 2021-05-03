package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Mechanic;
import com.novi.eindwerkstuk.repository.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MechanicServiceImpl implements MechanicService{
    @Autowired
    MechanicRepository mechanicRepository;

    @Override
    public Mechanic getMechanicById(long id) {
        if (mechanicRepository.existsById(id)) {
            return mechanicRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addMechanic(Mechanic mechanic) {
        Mechanic newMechanic = mechanicRepository.save(mechanic);
        return newMechanic.getMechanic_id();
    }

    @Override
    public void deleteMechanic(long id) {
        if (mechanicRepository.existsById(id)) {
            mechanicRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateMechanic(long id, Mechanic mechanic) {
        if (mechanicRepository.existsById(id)) {
            Mechanic existingMechanic = mechanicRepository.findById(id).get();
            existingMechanic.setFirst_name(mechanic.getFirst_name());
            existingMechanic.setLast_name(mechanic.getLast_name());
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
