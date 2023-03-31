package com.example.Investigation.model;

import com.example.Investigation.model.enums.EvidenceState;
import com.example.Investigation.model.id.UserEvidenceId;
import jakarta.persistence.*;

@Entity
@Table(name = "userEvidence")
public class UserEvidence {
    @EmbeddedId
    private UserEvidenceId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @MapsId("evidenceId")
    @JoinColumn(name = "EVIDENCE_ID", nullable = false)
    private Evidence evidence;

    @Enumerated(EnumType.STRING)
    private EvidenceState evidenceState;
}
