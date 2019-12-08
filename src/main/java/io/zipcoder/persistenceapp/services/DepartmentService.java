package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.dao.DepartmentRepository;
import io.zipcoder.persistenceapp.models.Department;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public Department create(Department department){
        return departmentRepository.save(department);
    }

    public Department read(int departmentNumber){
        return departmentRepository.findOne(departmentNumber);
    }

    public Department update(int departmentNumber, Department newDepartmentInfo){
        Department originalDepartment = departmentRepository.findOne(departmentNumber);
        originalDepartment.setDepartmentManager(newDepartmentInfo.getDepartmentManager());
        originalDepartment.setDepartmentName(newDepartmentInfo.getDepartmentName());
        originalDepartment.setDepartmentNumber(newDepartmentInfo.getDepartmentNumber());

        return departmentRepository.save(originalDepartment);
    }

    public Boolean delete(int departmentNumber){
        departmentRepository.delete(departmentNumber);
        return true;
    }
}
