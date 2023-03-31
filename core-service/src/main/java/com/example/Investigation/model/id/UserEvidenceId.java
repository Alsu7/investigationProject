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
public class UserEvidenceId implements Serializable {
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "EVIDENCE_ID")
    private Long evindenceId;
}
