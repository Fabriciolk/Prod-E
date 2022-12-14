package com.emp.prode.model.entity.user;

import jakarta.persistence.*;

@Entity
@Table(name = "Professor")
public class Professor implements User
{
    @EmbeddedId
    private ProfessorPK professorPK;
    @MapsId(value = "professorLogin")
    @JoinColumn(name = "professorLogin", referencedColumnName = "userLogin")
    @Transient
    private SystemUser systemUser;
    @Column(name = "name", nullable = false, length = 200)
    private String name;

    public Professor() {}

    public Professor(ProfessorPK professorPK, String name) {
        this.professorPK = professorPK;
        this.name = name;
    }

    public ProfessorPK getProfessorPK() {
        return professorPK;
    }

    public void setProfessorPK(ProfessorPK professorPK) {
        this.professorPK = professorPK;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }

    public void setSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public UserType getUserType() {
        return UserType.PROFESSOR;
    }
}
