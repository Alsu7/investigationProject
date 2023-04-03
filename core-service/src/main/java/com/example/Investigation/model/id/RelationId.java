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
public class RelationId implements Serializable {
    @Column(name = "CHARACTER_ID_1")
    private Long characterId1;

    @Column(name = "CHARACTER_ID_2")
    private Long characterId2;
}
