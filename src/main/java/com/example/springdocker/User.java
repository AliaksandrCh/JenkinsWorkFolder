package com.example.springdocker;

import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Service
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String password;
}
