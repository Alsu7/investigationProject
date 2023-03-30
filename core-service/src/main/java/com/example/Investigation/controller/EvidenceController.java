package com.example.Investigation.controller;

import com.example.Investigation.dto.EvidenceRequest;
import com.example.Investigation.service.EvidenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/investigation/evidence")
@RequiredArgsConstructor
public class EvidenceController {
    private final EvidenceService evidenceService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String setEvidence (@RequestBody EvidenceRequest evidenceRequest){
        evidenceService.setEvidence(evidenceRequest);
        return "Evidence have successfully added!";
    }
}
