package com.vermeg.leave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.leave.entities.Manager;

@Repository("ManagerRepository")
public interface ManagerRepo extends JpaRepository<Manager, Integer> {

}
