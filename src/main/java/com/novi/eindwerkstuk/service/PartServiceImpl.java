package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Part;
import com.novi.eindwerkstuk.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceImpl implements PartService{
    @Autowired
    PartRepository partRepository;

    @Override
    public List<Part> getAllParts(){
        return partRepository.findAll();
    }

    @Override
    public Part getPartById(long id) {
        if (partRepository.existsById(id)) {
            return partRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addPart(Part part) {
        Part newCustomer = partRepository.save(part);
        return newCustomer.getPart_id();
    }

    @Override
    public void deletePart(long id) {
        if (partRepository.existsById(id)) {
            partRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updatePart(long id, Part part) {
        if (partRepository.existsById(id)) {
            Part existingPart = partRepository.findById(id).get();
            existingPart.setPart_name(part.getPart_name());
            existingPart.setPart_price(part.getPart_price());
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
