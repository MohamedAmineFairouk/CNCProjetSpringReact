package com.data.auth.service;

import com.data.auth.model.Etudiant;

public interface UserService {
    void save(Etudiant user);

    Etudiant findByUsername(String username);
}
