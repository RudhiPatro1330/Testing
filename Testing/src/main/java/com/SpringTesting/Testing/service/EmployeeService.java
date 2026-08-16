package com.SpringTesting.Testing.service;


import com.SpringTesting.Testing.dto.EmployeeRequestDTO;
import com.SpringTesting.Testing.dto.EmployeeResponseDTO;
import com.SpringTesting.Testing.entity.Employee;
import com.SpringTesting.Testing.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    public EmployeeResponseDTO createEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        Employee employee = modelMapper.map(employeeRequestDTO, Employee.class);
        employee = employeeRepository.save(employee);
        return modelMapper.map(employee, EmployeeResponseDTO.class);

    }

    public List<EmployeeResponseDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(employee -> modelMapper.map(employee,EmployeeResponseDTO.class))
                .collect(Collectors.toList());
    }

}
