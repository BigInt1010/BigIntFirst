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
@Table(name = "vehicle_info")
public class VehicleInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    @Column(name = "vehicle_no")
    @NotEmpty(message = "*Please provide your vehicle registration no.")
    private String vehicleNo;
    @Column(name = "rc_no")
    @NotEmpty(message = "*Please provide your vehicle rc no")
    private String rcNo;
    @Column(name = "owner_nid_no")
    @NotEmpty(message = "Please provide your vehicle model.")
    private String vehicleModel;
    @Column(name = "manufacture_year")
    @NotEmpty(message = "*Please provide your vehicle manufacture year")
    private String vehicleManufacYear;
    @Column(name = "manufacture_company")
    @NotEmpty(message = "*Please provide your vehile manufacture company.")
    private String vehicleManufacCompany;
    @Column(name = "status")
    private int status;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getRcNo() {
        return rcNo;
    }

    public void setRcNo(String rcNo) {
        this.rcNo = rcNo;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleManufacYear() {
        return vehicleManufacYear;
    }

    public void setVehicleManufacYear(String vehicleManufacYear) {
        this.vehicleManufacYear = vehicleManufacYear;
    }

    public String getVehicleManufacCompany() {
        return vehicleManufacCompany;
    }

    public void setVehicleManufacCompany(String vehicleManufacCompany) {
        this.vehicleManufacCompany = vehicleManufacCompany;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
