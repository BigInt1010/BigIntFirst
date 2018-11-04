package com.hrl.happy.repository;

import com.hrl.happy.model.PromoCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("promoCodeRepository")
public interface PromoCodeRepository extends JpaRepository<PromoCode, Long> {
}
