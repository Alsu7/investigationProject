package com.example.Investigation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userNote")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserNote {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @ManyToOne
    @MapsId("userStoryId")
    @JoinColumn(name = "USER_ID", nullable = false)
    @JoinColumn(name = "STORY_ID", nullable = false)
    private UserStory userStory;

    @ManyToOne
    @MapsId("characterId")
    @JoinColumn(name = "CHARACTER_ID")
    private Character character;

    private String description;

}
