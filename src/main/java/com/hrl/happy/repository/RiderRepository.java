package com.hrl.happy.repository;

import com.hrl.happy.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("riderRepository")
public interface RiderRepository extends JpaRepository<Rider, Long> {
}