package com.shreya.jspservlet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor

public class User {

    private String username;
    private String password;

}
