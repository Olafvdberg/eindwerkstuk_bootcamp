package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.model.Reperation;

import java.util.List;

public interface ReperationService {
    List<Reperation> getAllReperations();
    Reperation getReperationById(long id);
    List<Reperation> getReperationByReperation(String to_do_reperation);
    long addReperation(Reperation reperation);
    void deleteReperation(long id);
    void updateReperation(long id, Reperation reperation);
}
