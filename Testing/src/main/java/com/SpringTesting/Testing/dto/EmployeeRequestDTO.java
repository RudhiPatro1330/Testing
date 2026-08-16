package com.SpringTesting.Testing.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequestDTO {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private boolean status;
}
