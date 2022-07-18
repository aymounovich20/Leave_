package com.vermeg.leave.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    //@NotEmpty(message = "E-mail cannot be empty!")
    @Column(name = "email")
    private String email;

    //@NotEmpty(message = "Password cannot be empty!")
    //@Length(min = 5, message = "Choose atleast five characters for password!")
    @Column(name = "password")
    private String password;

    //@NotEmpty(message = "Please provide a role!")
    @Column(name = "role")
    private String role;

    //@NotEmpty(message = "Please provide first name!")
    @Column(name = "first_name")
    private String firstName;

    //@NotEmpty(message = "Please provide last name!")
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "isActive")
    private boolean isActive = true;
    
    @ManyToOne
	@JoinColumn(name="manager_id")
    Manager manager;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public boolean isActive() {
	return isActive;
    }

    public void setIsActive(boolean active) {
	this.isActive = active;
    }
}
