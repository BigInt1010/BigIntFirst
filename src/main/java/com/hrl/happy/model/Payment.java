package com.hrl.happy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id")
    private int paymentId;
    @Column(name = "payment_type")
    private String paymentType;
    @Column(name = "payment_date")
    private Date paymentDate;
    @Column(name = "ride_cost")
    private double rideCost;
    @Column(name = "total_ride_cost")
    private double totalRideCost;
    @ManyToOne
    @JoinColumn(name = "PROMO_CODE_ID")
    private PromoCode promocCodeId;
    @ManyToOne
    @JoinColumn(name = "PRICING_ID")
    private Pricing pricingId;
    @ManyToOne
    @JoinColumn(name = "DRIVER_ID")
    private Driver driverId;
    @ManyToOne
    @JoinColumn(name = "RIDER_ID")
    private Rider riderId;


}