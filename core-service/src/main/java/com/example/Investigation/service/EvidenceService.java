package com.example.Investigation.service;

import com.example.Investigation.dto.EvidenceRequest;
import com.example.Investigation.model.Evidence;
import com.example.Investigation.repository.EvidenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
