package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Bon;

public interface BonService {

    Bon getBonById(long id);
    void updateBon(long id, Bon bon);
}
