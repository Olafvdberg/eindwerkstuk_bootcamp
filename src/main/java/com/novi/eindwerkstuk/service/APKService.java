package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.APK;
import com.novi.eindwerkstuk.model.Action;

import java.util.List;

public interface APKService {

    List<APK> getAllAPK();
    APK getAPKById(long id);
    long addAPK(APK apk);
    void deleteAPK(long id);
    void updateAPK (long id, APK apk);
}
