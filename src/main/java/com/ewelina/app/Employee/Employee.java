package com.ewelina.app.Employee;

import com.ewelina.app.Orders.Orders;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String employeeName;

    @NotBlank
    private String employeeSurname;

    @NotNull
    private Long phoneNumber;

    @Size(max = 255)
    private String note;

    @NotNull
    private Double manHourCost;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Orders> orders = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getManHourCost() {
        return manHourCost;
    }

    public void setManHourCost(Double manHourCost) {
        this.manHourCost = manHourCost;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSurname='" + employeeSurname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", note='" + note + '\'' +
                ", manHourCost=" + manHourCost +
//                ", orders=" + orders +
                '}';
    }
}
