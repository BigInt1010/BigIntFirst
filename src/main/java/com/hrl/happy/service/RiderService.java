package com.hrl.happy.service;


import com.hrl.happy.model.Rider;
import com.hrl.happy.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("riderService")
public class RiderService {

    private RiderRepository riderRepository;

    @Autowired
    public RiderService(@Qualifier("riderRepository") RiderRepository riderRepository) {

        this.riderRepository = riderRepository;
    }

    public Rider saveRider(Rider rider) {

        return riderRepository.save(rider);
    }
}
