package com.example.Investigation.model;

import com.example.Investigation.model.enums.PhaseState;
import com.example.Investigation.model.id.UserPhaseId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userPhase")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserPhase {
    @EmbeddedId
    private UserPhaseId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @MapsId("phaseId")
    @JoinColumn(name = "PHASE_ID", nullable = false)
    private Phase phase;

    @Enumerated(EnumType.STRING)
    private PhaseState phaseState;
}
