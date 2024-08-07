package com.example.carrentalproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users", schema = "p2p_car_rental")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //------------------------------------//
    // Relationships
    @OneToMany(mappedBy = "ownerUser")
    private List<Listing> ownedListings;

    @OneToMany(mappedBy = "renterUser")
    private List<Rental> rentals;

    @OneToMany(mappedBy = "reviewerUser")
    private List<Review> givenReviews;

    @OneToMany(mappedBy = "reviewedUser")
    private List<Review> receivedReviews;
    //------------------------------------//



    @NotNull
    @Column(nullable = false, unique = true, length = 40)
    private String email;

    @NotNull
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @NotNull
    @Column(name="first_name",nullable = false, unique = true, length = 20)
    private String firstName;

    @NotNull
    @Column(name="last_name",nullable = false, unique = true, length = 20)
    private String lastName;


    @NotNull
    @Column(nullable = false, length = 60)
    private String password;

    @Column(name = "is_renter")
    private Boolean isRenter;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "street_address", length = 100)
    private String streetAddress;

    @Column(length = 50)
    private String city;

    @Column(length = 50)
    private String stateProvince;

    @Column(length = 20)
    private String postalCode;

    @Column(length = 50)
    private String country;

    private Float latitude;

    private Float longitude;


    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Listing> getOwnedListings() {
        return ownedListings;
    }

    public void setOwnedListings(List<Listing> ownedListings) {
        this.ownedListings = ownedListings;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public List<Review> getGivenReviews() {
        return givenReviews;
    }

    public void setGivenReviews(List<Review> givenReviews) {
        this.givenReviews = givenReviews;
    }

    public List<Review> getReceivedReviews() {
        return receivedReviews;
    }

    public void setReceivedReviews(List<Review> receivedReviews) {
        this.receivedReviews = receivedReviews;
    }

    public @NotNull String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    public @NotNull String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    public @NotNull String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    public @NotNull String getLastName() {
        return lastName;
    }


    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    public @NotNull String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    public Boolean getRenter() {
        return isRenter;
    }

    public void setRenter(Boolean renter) {
        isRenter = renter;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }
}