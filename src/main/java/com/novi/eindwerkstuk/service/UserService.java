package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.AppAuthority;
import com.novi.eindwerkstuk.model.AppUser;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface UserService {

    public abstract String createUser(AppUser user);
    public abstract void updateUser(String username, AppUser user);
    public abstract void deleteUser(String username);
    public abstract Collection<AppUser> getUsers();
    public abstract Optional<AppUser> getUser(String username);
    public abstract boolean userExists(String username);
    public abstract Set<AppAuthority> getAuthorities(String username);
    public abstract void addAuthority(String username, String authority);
    public abstract void removeAuthority(String username, String authority);

}