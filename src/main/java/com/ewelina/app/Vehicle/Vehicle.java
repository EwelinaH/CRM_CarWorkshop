package com.ewelina.app.Vehicle;

import com.ewelina.app.Customer.Customer;
import com.ewelina.app.Orders.Orders;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    @NotNull
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    private LocalDate nextInspection;

    public Long getId() {
        return id;
    }

    @ManyToOne
    private Customer customer; //(wiele pojazdów wskazuje na jednego customera)

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<Orders> ordersList = new ArrayList<>();

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

    public Vehicle() {
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
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
                ", ordersList=" + ordersList.size() +
                '}';
    }

}
