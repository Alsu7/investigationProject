package com.example.Investigation.model.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserPhaseId implements Serializable {
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "PHASE_ID")
    private Long phaseId;
}
