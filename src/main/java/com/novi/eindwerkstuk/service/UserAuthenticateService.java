package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.payload.request.AuthenticationRequest;
import com.novi.eindwerkstuk.payload.response.AuthenticationResponse;

public interface UserAuthenticateService {

    public AuthenticationResponse authenticateUser(AuthenticationRequest authenticationRequest);

}
