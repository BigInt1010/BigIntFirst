package com.hrl.happy.service;

import com.hrl.happy.model.Trip;
import com.hrl.happy.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("tripService")
public class TripService {

    private TripRepository tripRepository;

    @Autowired
    public TripService(@Qualifier("tripRepository") TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Trip saveTrip(Trip trip) {

        return tripRepository.save(trip);
    }
}
