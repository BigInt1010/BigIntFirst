package com.hrl.happy.repository;


import com.hrl.happy.model.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pricingRepository")
public interface PricingRepository extends JpaRepository<Pricing, Long> {
}
