package com.example.Investigation.model;

import com.example.Investigation.model.Story;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "character")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column(unique = true)
    private String name;

    private Long age;
    private String location;
    private String motive;
    private boolean isKiller;
    private boolean isVictim;
    private String alibi;
    private String imageLink;

    private String description;

    @ManyToOne
    @MapsId("storyId")
    @JoinColumn(name = "STORY_ID", nullable = false)
    private Story story;
}
