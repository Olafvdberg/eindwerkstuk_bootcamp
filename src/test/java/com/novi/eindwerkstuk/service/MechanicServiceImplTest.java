package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Mechanic;
import com.novi.eindwerkstuk.repository.ActionRepository;
import com.novi.eindwerkstuk.repository.MechanicRepository;
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
class MechanicServiceImplTest {

    @Autowired
    private MechanicService mechanicService;

    @MockBean
    private MechanicRepository mechanicRepository;

    @Mock
    Mechanic mechanic;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        mechanic = new Mechanic("Henk", "van de beek");

        Mockito
                .when(mechanicRepository.findAllById(Collections.singleton(mechanic.getMechanic_id())))
                .thenReturn((List<Mechanic>) mechanic);

        int id = 1;
        int expected = 1;

        Mechanic found = mechanicService.getMechanicById(id);

        assertEquals(expected, found.getMechanic_id());
    }
}