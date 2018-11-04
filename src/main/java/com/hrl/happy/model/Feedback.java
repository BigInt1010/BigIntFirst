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
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "feedback_id")
    private int id;

    @OneToOne
    @JoinColumn(name = "TRIP_ID")
    private Trip tripId;

    @Column(name = "status")
    private String status;

    @Column(name = "feedback_text")
    @NotEmpty(message = "*Please give your feedback.")
    private String feedback;
}
