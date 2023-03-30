package com.example.Investigation.service;

import com.example.Investigation.dto.PhaseRequest;
import com.example.Investigation.model.Phase;
import com.example.Investigation.repository.PhaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhaseService {

    private final PhaseRepository phaseRepository;

    public void setPhase(PhaseRequest phaseRequest){
        Phase phase = new Phase();
        phase.setDescription(phaseRequest.getDescription());
        //TODO: ADD mapping here
        phaseRepository.save(phase);
    }

    public List<Phase> getPhases(){
        //TODO: ADD mapping here
        return phaseRepository.findAll();
    }

}
