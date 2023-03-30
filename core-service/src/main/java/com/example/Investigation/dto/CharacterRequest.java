package com.example.Investigation.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CharacterRequest {

    private Long id;
    private String description;
    //TODO: ADD field for request
}
