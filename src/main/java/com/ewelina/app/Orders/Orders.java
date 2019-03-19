package com.ewelina.app.Orders;

import com.ewelina.app.Employee.Employee;
import com.ewelina.app.Vehicle.Vehicle;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    private LocalDate puttingToRepairDate;

    @NotNull
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    private LocalDate plannedStartRepairDate;

    @NotNull
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    private LocalDate repairStartDate;

    @Size(max = 255)
    private String problemDescription;

    @Size(max = 255)
    private String repairDescription;

    @NotNull
    private String repairStatus;

    @NotNull
    private Double repairCostForCustomer;


    private Double componentsCost;

    @NotNull
    private Double employeeManHour;

    @NotNull
    private Double workingHours;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Vehicle vehicle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getPuttingToRepairDate() {
        return puttingToRepairDate;
    }

    public void setPuttingToRepairDate(LocalDate puttingToRepairDate) {
        this.puttingToRepairDate = puttingToRepairDate;
    }

    public LocalDate getPlannedStartRepairDate() {
        return plannedStartRepairDate;
    }

    public void setPlannedStartRepairDate(LocalDate plannedStartRepairDate) {
        this.plannedStartRepairDate = plannedStartRepairDate;
    }

    public LocalDate getRepairStartDate() {
        return repairStartDate;
    }

    public void setRepairStartDate(LocalDate repairStartDate) {
        this.repairStartDate = repairStartDate;
    }

    public String getProblemDesctiption() {
        return problemDescription;
    }

    public void setProblemDesctiption(String problemDesctiption) {
        this.problemDescription = problemDesctiption;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public Double getRepairCostForCustomer() {
        return repairCostForCustomer;
    }

    public void setRepairCostForCustomer(Double repairCostForCustomer) {
        this.repairCostForCustomer = repairCostForCustomer;
    }

    public Double getComponentsCost() {
        return componentsCost;
    }

    public void setComponentsCost(Double componentsCost) {
        this.componentsCost = componentsCost;
    }

    public Double getEmployeeManHour() {
        return employeeManHour;
    }

    public void setEmployeeManHour(Double employeeManHour) {
        this.employeeManHour = employeeManHour;
    }

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", puttingToRepairDate=" + puttingToRepairDate +
                ", plannedStartRepairDate=" + plannedStartRepairDate +
                ", repairStartDate=" + repairStartDate +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairDescription='" + repairDescription + '\'' +
                ", repairStatus='" + repairStatus + '\'' +
                ", repairCostForCustomer=" + repairCostForCustomer +
                ", componentsCost=" + componentsCost +
                ", employeeManHour=" + employeeManHour +
                ", workingHours=" + workingHours +
                ", employee=" + employee +
                ", vehicle=" + vehicle +
                '}';
    }

}
