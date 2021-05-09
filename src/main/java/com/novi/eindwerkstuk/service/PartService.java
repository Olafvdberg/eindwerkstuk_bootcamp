package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Part;

import java.util.List;

public interface PartService {
    List<Part> getAllParts();
    Part getPartById(long id);
    long addPart(Part part);
    void deletePart(long id);
    void updatePart(long id, Part part);
}
