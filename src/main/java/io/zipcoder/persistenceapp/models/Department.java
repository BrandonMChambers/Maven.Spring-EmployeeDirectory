package io.zipcoder.persistenceapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    //start with the employee directory
    @Id
    private int departmentNumber;
    private String departmentName;
    private Employee departmentManager;

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentNumber(int departmentNUmber) {
        this.departmentNumber = departmentNUmber;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentManager(Employee departmentManager) {
        this.departmentManager = departmentManager;
    }
}
