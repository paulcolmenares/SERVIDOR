package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;  
import org.springframework.security.core.userdetails.User;

@Service
public class UserServ implements UserDetailsService{

    @Autowired
    private Repo_Usuarios users;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional<Usuario> usr= users.findById(username);
       List<GrantedAuthority> roles= new ArrayList<>();
       roles.add(new SimpleGrantedAuthority("AUTORIZADO"));
       UserDetails userDet = new User (usr.get().getLOGIN(), usr.get().getPasswd(),roles);
       return userDet;
    }
}