package com.example.carrentalproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "vehicles", schema = "p2p_car_rental",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"year", "make", "model"})
})
@Check(constraints = "year >= 1900 AND year <= EXTRACT(YEAR FROM CURRENT_DATE) + 1")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String make;

    @Column(length = 30)
    private String model;

    @Column(length = 30)
    private String submodel;

    private float year;

    private Float mpg;

    private Short doors;

    private Float horsepower;


    private enum FuelType {
        PETROL, DIESEL, ELECTRIC, HYBRID
    }

    private enum TransmissionType {
        MANUAL, AUTOMATIC
    }

    // Enum types
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "fuel_type")
    private FuelType fuel;


    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "transmission_type")
    private TransmissionType transmission;


}

