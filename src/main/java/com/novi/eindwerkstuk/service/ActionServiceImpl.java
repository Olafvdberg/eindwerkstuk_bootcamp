package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionServiceImpl implements ActionService{

    @Autowired
    ActionRepository actionRepository;

    @Override
    public Action getActionById(long id) {
        if (actionRepository.existsById(id)) {
            return actionRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addAction(Action action) {
        Action newAction = actionRepository.save(action);
        return newAction.getAction_id();
    }

    @Override
    public void deleteAction(long id) {
        if (actionRepository.existsById(id)) {
            actionRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateAction(long id, Action action) {
        if (actionRepository.existsById(id)) {
            Action existingAction= actionRepository.findById(id).get();
            existingAction.setAction_name(action.getAction_name());
            existingAction.setAction_price(action.getAction_price());
        }
        else {
            throw new RecordNotFoundException();
        }
    }

}
