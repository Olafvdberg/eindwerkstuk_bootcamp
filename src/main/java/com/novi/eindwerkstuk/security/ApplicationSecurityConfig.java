package com.novi.eindwerkstuk.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails AdminUser = User.builder()
                .username("Admin")
                .password(passwordEncoder.encode("password"))
                .roles(ApplicationUserRole.ADMIN.name())
                .build();

        UserDetails AdministrativeAssistantUser = User.builder()
                .username("AdministrativeAssistant")
                .password(passwordEncoder.encode("password"))
                .roles(ApplicationUserRole.ADMINISTRATIVEASSISTANT.name())
                .build();

        UserDetails MechanicUser = User.builder()
                .username("Mechanic")
                .password(passwordEncoder.encode("password"))
                .roles(ApplicationUserRole.MECHANIC.name())
                .build();

        UserDetails CashierUser = User.builder()
                .username("Cashier")
                .password(passwordEncoder.encode("password"))
                .roles(ApplicationUserRole.CASHIER.name())
                .build();

        UserDetails BackOfficeAssistantUser = User.builder()
                .username("BackOfficeAssistant")
                .password(passwordEncoder.encode("password"))
                .roles(ApplicationUserRole.BACKOFFICEASSISTANT.name())
                .build();

        return new InMemoryUserDetailsManager(
                AdminUser,
                AdministrativeAssistantUser,
                MechanicUser,
                CashierUser,
                BackOfficeAssistantUser
        );
    }
}
