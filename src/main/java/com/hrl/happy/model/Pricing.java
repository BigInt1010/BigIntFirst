package com.hrl.happy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pricing")
public class Pricing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pricing_id")
    private int pricingId;
    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private Country countryId;
    @Column(name = "base_price")
    private double basePrice;
    @Column(name = "pricing_city")
    private String pricingCity;
    @Column(name = "price_per_kilo")
    private double pricePerKilo;
    @Column(name = "waiting_price_per_minute")
    private double waitingPricePerMinute;
    @Column(name = "traffic_jam_price")
    private double trafficJamPrice;
    @Column(name = "pricing_note")
    private String pricingNote;


}
