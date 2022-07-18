package com.vermeg.leave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.leave.entities.Employee;

@Repository("bookRepository")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
