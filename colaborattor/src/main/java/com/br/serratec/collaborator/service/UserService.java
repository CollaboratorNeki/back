//VERIFICAR E CORRIGIR SE NECESSARIO

package com.br.serratec.collaborator.service;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.serratec.collaborator.model.User;
import com.br.serratec.collaborator.repository.UserRepository;


@Service

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(org.apache.catalina.User user) {
        return userRepository.save(user);
    }
    
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
