package io.github.gorgex.springjwtauth.model;

import lombok.Data;

@Data
public class AuthRequest {

    private String username;
    private String password;
}
