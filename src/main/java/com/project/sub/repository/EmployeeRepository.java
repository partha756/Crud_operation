package com.project.sub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sub.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
