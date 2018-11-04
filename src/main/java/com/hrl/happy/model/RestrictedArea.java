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
@Table(name = "restrictedArea")
public class RestrictedArea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restricted_area_id")
    private int id;
    @Column(name = "restricted_area_name")
    private String restrictedAreaName;
    @Column(name = "restricted_area_city")
    private String restrictedAreaCity;
    @ManyToOne
    @JoinColumn(name = "STATES_ID")
    private States statesId;
    @Column(name = "restricted_area_note")
    private String restrictedAreaNote;
}