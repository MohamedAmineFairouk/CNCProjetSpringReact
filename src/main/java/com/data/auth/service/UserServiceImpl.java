package com.data.auth.service;

import com.data.auth.model.Etudiant;
import com.data.auth.repository.ChoixRepository;
import com.data.auth.repository.EtudiantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private EtudiantRepository userRepository;
    @Autowired
    private ChoixRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Etudiant user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public Etudiant findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
