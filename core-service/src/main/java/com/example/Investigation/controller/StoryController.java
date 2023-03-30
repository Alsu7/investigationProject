package com.example.Investigation.controller;

import com.example.Investigation.dto.StoryRequest;
import com.example.Investigation.model.Story;
import com.example.Investigation.service.StoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investigation/story")
@RequiredArgsConstructor
public class StoryController {
    private final StoryService storyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String setStory(@RequestBody StoryRequest storyRequest){
        storyService.setStory(storyRequest);
        return "Story was added successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Story> getStores (){
        return storyService.getStores();
    }

}
