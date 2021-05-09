package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.APK;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.repository.APKRepository;
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
class APKServiceImplTest {

    @Autowired
    private APKService apkService;

    @MockBean
    private APKRepository apkRepository;

    @Mock
    APK apk;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        apk = new APK("5 mei 2021", "afgekeurd", "achterlamp", 45);

        Mockito
                .when(apkRepository.findAllById(Collections.singleton(apk.getApk_id())))
                .thenReturn((List<APK>) apk);

        int id = 1;
        int expected = 1;

        APK found = apkService.getAPKById(id);

        assertEquals(expected, found.getApk_id());
    }

}