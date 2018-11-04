package com.hrl.happy.repository;

import com.hrl.happy.model.VehicleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleRepository")
public interface VehicleRepository extends JpaRepository<VehicleInfo, Long> {
    /*VehicleInfo findVehicleInfoById(int id);*/
    VehicleInfo findVehicleInfoByRcNo(String rcNo);
}
