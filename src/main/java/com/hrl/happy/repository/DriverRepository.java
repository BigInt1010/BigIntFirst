package com.hrl.happy.repository;

import com.hrl.happy.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("driverRepository")
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Driver findDriversById(int id);
}
