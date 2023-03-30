package com.example.Investigation.repository;

import com.example.Investigation.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}
