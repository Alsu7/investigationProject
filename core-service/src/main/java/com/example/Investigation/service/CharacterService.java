package com.example.Investigation.service;

import com.example.Investigation.dto.CharacterRequest;
import com.example.Investigation.model.Character;
import com.example.Investigation.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public void addCharacter(CharacterRequest characterRequest){
        Character character = new Character();
        character.setDescription(characterRequest.getDescription());
        //TODO: ADD mapping here
        characterRepository.save(character);
    }

    public List<Character> getCharacters(){
        //TODO: ADD mapping here
        return characterRepository.findAll();
    }
}
