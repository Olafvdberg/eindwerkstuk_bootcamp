package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Reperation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ContextConfiguration(classes = {EindwerkstukApplication.class})
class ReperationRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ReperationRepository reperationRepository;

    @Test
    void testFindByStatusStartingWithOrderByStatus() {
        //given
        Reperation reperation = new Reperation("5 mei 2021", "gedaan");
        entityManager.persist(reperation);
        entityManager.flush();

        //when
        Reperation found = (Reperation) reperationRepository.findByStatusStartingWithOrderByStatus(reperation.getStatus());

        //then
        String expected = "5 mei 2021";
        String actual = found.getStatus();
        assertEquals(expected, actual);
    }
}