package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.repository.ActionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {EindwerkstukApplication.class})
class ActionServiceImplTest {

    @Autowired
    private ActionService actionService;

    @MockBean
    private ActionRepository actionRepository;

    @Mock
    Action action;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        action = new Action("achterlamp vervangen", 30, "achterlamp vervangen", 30);

        Mockito
                .when(actionRepository.findAllById(Collections.singleton(action.getAction_id())))
                .thenReturn((List<Action>) action);

        int id = 1;
        int expected = 1;

        Action found = actionService.getActionById(id);

        assertEquals(expected, found.getAction_id());
    }

}