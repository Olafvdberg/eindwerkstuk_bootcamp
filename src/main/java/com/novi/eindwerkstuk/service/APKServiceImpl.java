package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.APK;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.repository.APKRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APKServiceImpl implements APKService{

    @Autowired
    APKRepository apkRepository;

    @Override
    public List<APK> getAllAPK(){
        return apkRepository.findAll();
    }

    @Override
    public APK getAPKById(long id) {
        if (apkRepository.existsById(id)) {
            return apkRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addAPK(APK apk) {
        APK newAPK = apkRepository.save(apk);
        return newAPK.getApk_id();
    }

    @Override
    public void deleteAPK(long id) {
        if (apkRepository.existsById(id)) {
            apkRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateAPK(long id, APK apk) {
        if (apkRepository.existsById(id)) {
            APK existingAPK= apkRepository.findById(id).get();
            existingAPK.setApk_date(apk.getApk_date());
            existingAPK.setApk_status(apk.getApk_status());
            existingAPK.setFound_errors(apk.getFound_errors());
        }
        else {
            throw new RecordNotFoundException();
        }
    }

}
