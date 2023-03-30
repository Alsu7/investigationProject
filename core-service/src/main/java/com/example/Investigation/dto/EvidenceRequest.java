package com.example.Investigation.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EvidenceRequest {
    private Long id;
    private String description;

    //TODO: ADD fields for request
}
