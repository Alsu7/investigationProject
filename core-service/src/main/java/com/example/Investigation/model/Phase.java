package com.example.Investigation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "phase")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Phase {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    @MapsId("storyId")
    @JoinColumn(name = "STORY_ID", nullable = false)
    private Story story;

    private String description;
}
