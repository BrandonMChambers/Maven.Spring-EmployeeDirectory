package io.zipcoder.persistenceapp.dao;

import io.zipcoder.persistenceapp.models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
