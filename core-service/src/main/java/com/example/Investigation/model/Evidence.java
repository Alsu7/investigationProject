package com.example.Investigation.model;

import com.example.Investigation.model.Phase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "evidence")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evidence {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    @MapsId("phaseId")
    @JoinColumn(name = "PHASE_ID", nullable = false)
    private Phase phase;

    private String description;
}
