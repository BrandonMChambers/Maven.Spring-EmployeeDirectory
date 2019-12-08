package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.dao.EmployeeRepository;
import io.zipcoder.persistenceapp.models.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Iterable<Employee> idex(){
        return employeeRepository.findAll();
    }
    //crud request

    //Create - POST
    public Employee create(Employee employee){
        return employeeRepository.save(employee);
    }

    //Read - GET
    public Employee read(int employeeNumber){
        return employeeRepository.findOne(employeeNumber);
    }

    //Update - PUT
    public Employee update(int employeeNumber, Employee newEmployeeInfo){
        Employee originalEmployee = employeeRepository.findOne(employeeNumber);
        originalEmployee.setFirstName(newEmployeeInfo.getFirstName());
        originalEmployee.setLastName(newEmployeeInfo.getLastName());
        originalEmployee.setDepartmentNumber(newEmployeeInfo.getDepartmentNumber());
        originalEmployee.setEmail(newEmployeeInfo.getEmail());
        originalEmployee.setPhoneNumber(newEmployeeInfo.getPhoneNumber());
        originalEmployee.setTitle(newEmployeeInfo.getTitle());
        originalEmployee.setHireDate(newEmployeeInfo.getHireDate());
        originalEmployee.setEmployeeNumber(newEmployeeInfo.getEmployeeNumber());
        return employeeRepository.save(originalEmployee);
    }

    //Delete - DELETE
    public Boolean delete(int employeeNumber){
        employeeRepository.delete(employeeNumber);
        return true;
    }
}
