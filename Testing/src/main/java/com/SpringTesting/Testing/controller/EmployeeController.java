package com.SpringTesting.Testing.controller;


import com.SpringTesting.Testing.dto.EmployeeRequestDTO;
import com.SpringTesting.Testing.dto.EmployeeResponseDTO;
import com.SpringTesting.Testing.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/employees")
public class EmployeeController {

    private final EmployeeService employeeService;


    @PostMapping("/createEmployee")
    public EmployeeResponseDTO createEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        return  employeeService.createEmployee(employeeRequestDTO);
    }

    @GetMapping("/allEmployees")
    public List<EmployeeResponseDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }



}
