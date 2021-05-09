package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.config.CustomUserDetailsService;
import com.novi.eindwerkstuk.payload.request.AuthenticationRequest;
import com.novi.eindwerkstuk.payload.response.AuthenticationResponse;
import com.novi.eindwerkstuk.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticateServiceImpl implements UserAuthenticateService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    JwtUtil jwtUtl;

    public AuthenticationResponse authenticateUser(AuthenticationRequest authenticationRequest) {

        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );
        }
        catch (BadCredentialsException ex) {
            throw new UsernameNotFoundException("Incorrect username or password");
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        final String jwt = jwtUtl.generateToken(userDetails);

        return new AuthenticationResponse(jwt);
    }

}
