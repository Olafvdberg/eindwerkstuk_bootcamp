package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Mechanic;
import com.novi.eindwerkstuk.repository.CustomerRepository;
import com.novi.eindwerkstuk.repository.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface MechanicService {
    List<Mechanic> getAllMechanics();
    Mechanic getMechanicById(long id);
    long addMechanic(Mechanic mechanic);
    void deleteMechanic(long id);
    void updateMechanic(long id, Mechanic mechanic);
}

