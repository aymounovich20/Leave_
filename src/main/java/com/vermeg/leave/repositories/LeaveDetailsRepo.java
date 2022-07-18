package com.vermeg.leave.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.leave.entities.LeaveDetails;

@Repository("LeaveDetailsRepository")
public interface LeaveDetailsRepo extends JpaRepository<LeaveDetails, Integer> {

}
