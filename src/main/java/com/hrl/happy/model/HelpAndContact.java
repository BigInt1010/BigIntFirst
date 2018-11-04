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
@Table(name = "help_and_contact")
public class HelpAndContact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "help_and_contact_id")
    private int helpAndContactId;

    @Column(name = "location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private Country countryId;
}
