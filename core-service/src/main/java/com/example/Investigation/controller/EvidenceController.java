package com.example.Investigation.controller;

import com.example.Investigation.dto.EvidenceRequest;
import com.example.Investigation.model.Evidence;
import com.example.Investigation.service.EvidenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investigation/evidence")
@RequiredArgsConstructor
public class EvidenceController {
    private final EvidenceService evidenceService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String setEvidence(@RequestBody EvidenceRequest evidenceRequest){
        evidenceService.setEvidence(evidenceRequest);
        return "Evidence have successfully added!";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Evidence> getEvidences (){
        return evidenceService.getEvidences();
    }

    @GetMapping(path = "/isOpen" )
    @ResponseStatus(HttpStatus.CREATED)
    public boolean isOpenPhaseForEvidence (@RequestParam(required = true) long id){
        return evidenceService.isOpenPhaseForEvidence(id);
    }
}
