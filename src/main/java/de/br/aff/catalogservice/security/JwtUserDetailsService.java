package de.br.aff.catalogservice.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //TODO: get a user from db

        if ("username".equals(username)) {
            return new User(username, "$2a$10$nDxisS6FdBwk04vXYWgTB.R//uwAO5G/oq0bIF9A.9ZcA6YH4ppkO", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User with username [ " + username + "] is not found");
        }
    }
}