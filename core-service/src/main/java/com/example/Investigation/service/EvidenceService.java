package com.example.Investigation.service;

import com.example.Investigation.dto.EvidenceRequest;
import com.example.Investigation.model.Evidence;
import com.example.Investigation.repository.EvidenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EvidenceService {
    private final EvidenceRepository evidenceRepository;

    public void setEvidence(EvidenceRequest evidenceRequest){
        Evidence evidence = new Evidence();
        evidence.setDescription(evidenceRequest.getDescription());
        //TODO: ADD mapping here
        evidenceRepository.save(evidence);
    }

    public List<Evidence> getEvidences(){
        //TODO: ADD mapping here
        return evidenceRepository.findAll();
    }

    public boolean isOpenPhaseForEvidence(Long evidenceId){
        //TODO: change condition here to logic check regarding phase
        return evidenceRepository.findById(evidenceId).isPresent();
    }
}
