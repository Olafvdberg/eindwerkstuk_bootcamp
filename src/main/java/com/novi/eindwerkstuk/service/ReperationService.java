package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.model.Reperation;

public interface ReperationService {
    Reperation getReperationById(long id);
    long addReperation(Reperation reperation);
    void deleteReperation(long id);
    void updateReperation(long id, Reperation reperation);
}
