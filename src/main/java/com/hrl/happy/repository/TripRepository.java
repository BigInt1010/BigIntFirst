package com.hrl.happy.repository;

import com.hrl.happy.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tripRepository")
public interface TripRepository extends JpaRepository<Trip, Long> {
}