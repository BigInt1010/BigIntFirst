package com.hrl.happy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "driver_profile")
public class DriverProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "driver_profile_id")
    private int driverProfileId;
    @NotEmpty(message = "*Please provide your full name")
    private String name;
    @Column(name = "active")
    private int active;
    @ManyToOne
    @JoinColumn(name = "STATES_ID")
    private States states;
    @ManyToOne
    @JoinColumn(name = "CAR_INFO")
    private VehicleInfo vehicleInfo;
    @Column(name = "driver_gender")
    private int gender;
    @Column(name = "driver_address")
    private String driverAdress;
    @Column(name = "driver_rating")
    private int driverRating;

    public int getDriverProfileId() {
        return driverProfileId;
    }

    public void setDriverProfileId(int driverProfileId) {
        this.driverProfileId = driverProfileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    public String getDriverAdress() {
        return driverAdress;
    }

    public void setDriverAdress(String driverAdress) {
        this.driverAdress = driverAdress;
    }

    public VehicleInfo getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(VehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }


    public int getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(int driverRating) {
        this.driverRating = driverRating;
    }
}
