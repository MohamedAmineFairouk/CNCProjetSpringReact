package com.data.auth.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "choix")
public class Choix {
    private Long id;
    private String name;
    private Set<Etudiant> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "choix")
    public Set<Etudiant> getUsers() {
        return users;
    }

    public void setUsers(Set<Etudiant> users) {
        this.users = users;
    }
}
