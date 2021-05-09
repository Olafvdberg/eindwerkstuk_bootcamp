package com.novi.eindwerkstuk.model;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaBuilder;

import static org.junit.jupiter.api.Assertions.*;

class APKTest {

    private APK apk;

    @BeforeEach
    void setUp() {
        this.apk = new APK("5 mei 2020", "afgekeurd", "achterlamp", 30);
    }

    @Test
    void testApk_date() {
        String expectedapk_date = "5 mei 2020";
        String actualapk_date = this.apk.getApk_date();
        assertEquals(expectedapk_date, actualapk_date);
    }

    @Test
    void testApk_status() {
        String expectedstatus = "afgekeurd";
        String actualstatus = this.apk.getApk_status();
        assertEquals(expectedstatus, actualstatus);
    }

    @Test
    void testfound_errors() {
        String expectedfound_errors = "achterlamp";
        String actualfound_errors = this.apk.getFound_errors();
        assertEquals(expectedfound_errors, actualfound_errors);
    }

    @Test
    void testApk_price() {
        long expectedapk_price = 30;
        long actualapk_price = this.apk.getApk_price();
        assertEquals(expectedapk_price, actualapk_price);
    }

}