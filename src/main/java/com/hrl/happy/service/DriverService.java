package com.hrl.happy.service;

import com.hrl.happy.model.Driver;
import com.hrl.happy.model.Role;
import com.hrl.happy.repository.DriverRepository;
import com.hrl.happy.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service("driverService")
public class DriverService {

    private DriverRepository driverRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public DriverService(@Qualifier("driverRepository") DriverRepository driverRepository,
                         @Qualifier("roleRepository") RoleRepository roleRepository,
                         BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.driverRepository = driverRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Driver findDriversById(int id) {
        return driverRepository.findDriversById(id);
    }

    public Driver saveDriver(Driver driver) {
        driver.setPassword(bCryptPasswordEncoder.encode(driver.getPassword()));
        Role userRole = roleRepository.findByRole("ADMIN");
        driver.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return driverRepository.save(driver);
    }


}
