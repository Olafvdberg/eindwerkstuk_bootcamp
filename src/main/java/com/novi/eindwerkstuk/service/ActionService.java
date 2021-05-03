package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Action;

public interface ActionService {

    Action getActionById(long id);
    long addAction(Action action);
    void deleteAction(long id);
    void updateAction(long id, Action action);

}
