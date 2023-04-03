package com.example.Investigation.model;

import com.example.Investigation.model.id.RelationId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "relation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Relation {
    @EmbeddedId
    private RelationId id;
    @ManyToOne
    @MapsId("characterId1")
    @JoinColumn(name = "CHARACTER_ID_1", nullable = false)
    private Character character1;

    @ManyToOne
    @MapsId("characterId2")
    @JoinColumn(name = "CHARACTER_ID_2", nullable = false)
    private Character character2;

    private String nameRelation;
}
