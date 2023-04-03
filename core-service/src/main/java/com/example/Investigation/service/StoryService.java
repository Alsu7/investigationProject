package com.example.Investigation.service;

import com.example.Investigation.dto.StoryRequest;
import com.example.Investigation.model.Story;
import com.example.Investigation.repository.StoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoryService {
    private final StoryRepository storyRepository;

    public void setStory(StoryRequest storyRequest){
        Story story = new Story();
        story.setDescription(storyRequest.getDescription());
        //TODO: ADD mapping here
        storyRepository.save(story);
    }

    public List<Story> getStores(){
        //TODO: ADD mapping here
        return storyRepository.findAll();
    }

}
