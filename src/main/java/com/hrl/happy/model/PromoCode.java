package com.hrl.happy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "promo_code")
public class PromoCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "promo_code_id")
    private int promoCodeId;
    @Column(name = "promo_type")
    private String promoType;
    @Column(name = "promo_start_date")
    private Date promoStartDate;
    @Column(name = "promo_start_time")
    private Time promoStartTime;
    @Column(name = "promo_end_date")
    private Date promoEndtDate;
    @Column(name = "promo_end_time")
    private Time promoEndTime;
    @Column(name = "promo_discount_percentage")
    private double promoDiscountPercentage;

}
