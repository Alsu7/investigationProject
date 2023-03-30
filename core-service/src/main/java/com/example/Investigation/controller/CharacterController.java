package com.example.Investigation.controller;

import com.example.Investigation.dto.CharacterRequest;
import com.example.Investigation.model.Character;
import com.example.Investigation.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/investigation/character")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String setCharacter (@RequestBody CharacterRequest characterRequest){
        characterService.addCharacter(characterRequest);
        return "Evidence have successfully added!";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Character> getCharacters (){
        return characterService.getCharacters();
    }

}
