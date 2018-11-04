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
@Table(name = "states")

public class States {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "states_id")
    private int id;

    @Column(name = "states_name")
    private String statesName;


    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;
}

