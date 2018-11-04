package com.hrl.happy.service;

import com.hrl.happy.model.PromoCode;
import com.hrl.happy.repository.PromoCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("promoCodeService")
public class PromoCodeService {

    private PromoCodeRepository promoCodeRepository;

    @Autowired
    public PromoCodeService(@Qualifier("promoCodeRepository") PromoCodeRepository promoCodeRepository) {
        this.promoCodeRepository = promoCodeRepository;
    }

    public PromoCode savePricing(PromoCode pricing) {

        return promoCodeRepository.save(pricing);
    }
}