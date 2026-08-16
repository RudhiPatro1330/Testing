package com.SpringTesting.Testing.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponseDTO {


    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private boolean status;
}
