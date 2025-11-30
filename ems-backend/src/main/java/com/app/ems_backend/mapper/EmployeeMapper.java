package com.app.ems_backend.mapper;

import com.app.ems_backend.dto.EmployeeDto;
import com.app.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        ); // To convert entity to dto when sending to frontend
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail() // to convert incoming dto to entity, when saving to DB
        );
    }
}
