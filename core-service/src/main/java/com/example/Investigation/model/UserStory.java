package com.example.Investigation.model;

import com.example.Investigation.model.enums.StoryState;
import com.example.Investigation.model.id.UserStoryId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "userStory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserStory {
    @EmbeddedId
    private UserStoryId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @ManyToOne
    @MapsId("storyId")
    @JoinColumn(name = "STORY_ID", nullable = false)
    private Story story;

    @Enumerated(EnumType.STRING)
    private StoryState storyState;

}
