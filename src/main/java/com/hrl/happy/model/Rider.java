package com.hrl.happy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rider")
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rider_id")
    private long riderId;
    @Column(name = "rider_fullname")
    @NotEmpty(message = "*Please provide your full name")
    private String riderFullname;
    @Column(name = "rider_mobile_no")
    @NotEmpty(message = "*Please provide a valid mobile number.")
    private String riderMobileNo;
    @Column(name = "rider_city")
    private String riderCity;
    @ManyToOne
    @JoinColumn(name = "rider_pricing_id")
    private Pricing riderPricingId;
    @Column(name = "rider_ratiing")
    private double riderRating;
}