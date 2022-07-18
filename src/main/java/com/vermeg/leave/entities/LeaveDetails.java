package com.vermeg.leave.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.vermeg.leave.utils.LeaveType;

@Entity
@Table(name = "leave_details")
public class LeaveDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;




    @Column(name = "from_date")
    private Date fromDate;

    //@NotNull(message = "Please provide end date!")
    @Column(name = "to_date")
    private Date toDate;

    //@NotEmpty(message = "Please select type of leave!")
    @Column(name = "leave_type")
    private LeaveType leaveType;

    //@NotEmpty(message = "Please provide a reason for the leave!")
    @Column(name = "reason")
    private String reason;

    @Column(name = "duration")
    private int duration;

    @Column(name = "accept_reject_flag")
    private boolean acceptRejectFlag;

    @Column(name = "active")
    private boolean active;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Date getFromDate() {
	return fromDate;
    }

    public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
    }

    public Date getToDate() {
	return toDate;
    }

    public void setToDate(Date toDate) {
	this.toDate = toDate;
    }

    public String getReason() {
	return reason;
    }

    public void setReason(String reason) {
	this.reason = reason;
    }

    public LeaveType getLeaveType() {
	return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
	this.leaveType = leaveType;
    }

    public int getDuration() {
	return duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    public boolean isAcceptRejectFlag() {
	return acceptRejectFlag;
    }

    public void setAcceptRejectFlag(boolean acceptRejectFlag) {
	this.acceptRejectFlag = acceptRejectFlag;
    }

    public boolean isActive() {
	return active;
    }

    public void setActive(boolean active) {
	this.active = active;
    }
}

