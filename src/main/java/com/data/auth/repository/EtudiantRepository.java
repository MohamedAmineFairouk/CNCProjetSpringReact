package com.data.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.auth.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Etudiant findByUsername(String username);
}
