package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Action;

import java.util.Collection;
import java.util.List;

public interface ActionService {

    List<Action> getAllActions();
    Action getActionById(long id);
    long addAction(Action action);
    void deleteAction(long id);
    void updateAction(long id, Action action);
}
