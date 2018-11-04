package com.hrl.happy.service;

import com.hrl.happy.model.VehicleInfo;
import com.hrl.happy.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("vehicleInfoService")
public class VehicleInfoService {
    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleInfoService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

   /* public VehicleInfo findVehicleInfoById(int id){
        return vehicleRepository.findVehicleInfoById(id);
    }*/

    public VehicleInfo findVehicleInfoByRcNo(String rcNo){
        return vehicleRepository.findVehicleInfoByRcNo(rcNo);
    }
    public VehicleInfo saveVehicleInfo(VehicleInfo vehicleInfo) {

        return vehicleRepository.save(vehicleInfo);
    }

}