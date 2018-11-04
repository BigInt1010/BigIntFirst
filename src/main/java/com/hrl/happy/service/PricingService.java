package com.hrl.happy.service;

import com.hrl.happy.model.Pricing;
import com.hrl.happy.repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pricingService")
public class PricingService {

    private PricingRepository pricingRepository;

    @Autowired
    public PricingService(@Qualifier("pricingRepository") PricingRepository pricingRepository) {
        this.pricingRepository = pricingRepository;
    }

    public Pricing savePricing(Pricing pricing) {

        return pricingRepository.save(pricing);
    }
}
