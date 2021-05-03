package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Part;

public interface PartService {
    Part getPartById(long id);
    long addPart(Part part);
    void deletePart(long id);
    void updatePart(long id, Part part);
}
