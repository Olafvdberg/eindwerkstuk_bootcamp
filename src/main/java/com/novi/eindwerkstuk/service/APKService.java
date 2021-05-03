package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.APK;

public interface APKService {

    APK getAPKById(long id);
    long addAPK(APK apk);
    void deleteAPK(long id);
    void updateAPK (long id, APK apk);
}
