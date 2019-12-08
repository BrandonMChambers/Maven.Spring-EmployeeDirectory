package io.zipcoder.persistenceapp.api;

import io.zipcoder.persistenceapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;

    }
    //crud
    //Request

    //Create - POST
   // @PostMapping

    //Read - GET
   // @GetMapping

    //Update - PUT
   // @PutMapping

    //Delete - DELETE
   // @DeleteMapping
}
