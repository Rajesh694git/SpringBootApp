package com.example.springapplication.Employees;

import javax.persistence.*;

import org.jetbrains.annotations.NotNull;

@Entity
@Table(name="employeedetails")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Column(name="firstname")
    private String firstName;
    @NotNull
    @Column(name="lastname")
    private String lastName;

    public EmployeeEntity() {

    }

    public Integer getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EmployeeEntity(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
