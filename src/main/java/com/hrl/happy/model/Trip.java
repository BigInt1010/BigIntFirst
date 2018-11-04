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
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trip_id")
    private long tripId;
    @Column(name = "start_longitude")
    private double startLongitude;
    @Column(name = "start_latitude")
    private double startLatitude;
    @Column(name = "end_longitude")
    private double endLongitude;
    @Column(name = "trip_date")
    private Date tripDate;
    @Column(name = "trip_start_time")
    private Time tripStartTime;
    @Column(name = "trip_end_time")
    private Time tripEndTime;
    @Column(name = "trip_waiting_time")
    private Time tripWaitingTime;
    @Column(name = "trip_traffic_time")
    private Time tripTrafficTime;
    @Column(name = "trip_status")
    private String TripStatus;
    @Column(name = "trip_distance")
    private double tripDistance;
    @Column(name = "driver_rating")
    private double driverRating;
    @Column(name = "rider_rating")
    private double riderRating;
    @ManyToOne
    @JoinColumn(name = "PROMO_CODE_ID")
    private PromoCode promoCodeId;
    @ManyToOne
    @JoinColumn(name = "PRICING_ID")
    private Pricing pricingId;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driverId;
    @ManyToOne
    @JoinColumn(name = "rider_id")
    private Rider riderId;

}
