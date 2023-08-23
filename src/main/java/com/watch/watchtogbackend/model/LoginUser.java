package com.watch.watchtogbackend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "login_user")
public class LoginUser {
    @Id
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}