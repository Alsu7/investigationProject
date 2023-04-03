package com.example.Investigation.controller;

import com.example.Investigation.dto.PhaseRequest;
import com.example.Investigation.model.Phase;
import com.example.Investigation.service.PhaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investigation/phase")
@RequiredArgsConstructor
public class PhaseController {

    private final PhaseService phaseService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String setPhase(@RequestBody PhaseRequest phaseRequest){
        phaseService.setPhase(phaseRequest);
        return "Phase was added successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Phase> getPhases (){
        return phaseService.getPhases();
    }

}
