package com.ewelina.app.Vehicle;

import com.ewelina.app.Customer.Customer;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String carModel;

    @NotBlank
    private String carBrand;

    @NotBlank
    private String productionYear;

    @NotBlank
    private String registrationNo;

    @NotBlank
    private LocalDate nextInspection;

    public Long getId() {
        return id;
    }

    @ManyToOne
    private Customer customer;

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public LocalDate getNextInspection() {
        return nextInspection;
    }

    public void setNextInspection(LocalDate nextInspection) {
        this.nextInspection = nextInspection;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", nextInspection=" + nextInspection +
                ", customer=" + customer +
                '}';
    }
}
