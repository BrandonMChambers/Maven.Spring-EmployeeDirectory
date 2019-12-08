package io.zipcoder.persistenceapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee implements Manager, AssistantManager {

    //Same comments apply to the department start with employee
    @Id
    private int employeeNumber; //auto increment
    private String firstName;
    private String lastName;
    private String title;
    private String phoneNumber; // will need to convert from int to string
    private String email;
    private Date hireDate; // May need a different datatype
    private int departmentNumber;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
    //may need to double check these methods
    @Override
    public boolean isAssistantManager() {
        return false;//
    }

    @Override
    public boolean isManager() {
        return false;//
    }
}
