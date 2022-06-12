package com.workat.mail;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserCreateRequest {

    private String name;
    private String email;


    public User toEntity() {
        return User.builder()
            .name(name)
            .email(email)
            .build();
    }
}
