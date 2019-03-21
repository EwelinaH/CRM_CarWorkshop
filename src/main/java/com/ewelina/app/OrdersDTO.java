package com.ewelina.app;

public class OrdersDTO {

    private String employeeName;
    private String employeeSurname;
    private Double workingHours;

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

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }

    public OrdersDTO() {
    }

    public OrdersDTO(String employeeName, String employeeSurname, Double workingHours) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "employeeName=" + employeeName +
                ", employeeSurname=" + employeeSurname +
                ", workingHours=" + workingHours +
                '}';
    }
}
