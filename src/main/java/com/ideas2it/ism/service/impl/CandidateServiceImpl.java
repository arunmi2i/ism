package com.ideas2it.ism.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideas2it.ism.dao.CandidateRepository;
import com.ideas2it.ism.entity.Candidate;
import com.ideas2it.ism.service.CandidateService;


/**
 * All the request passed from jsp are recieved at controller,
 * the action between controller and DAO layer is controlled here
 * any modifications , logics required are performed here.
 * 
 * @author M.Mani Bharathi
 *
 */
@Service
public class CandidateServiceImpl implements CandidateService{
	
    @Autowired
    private CandidateRepository candidateRepository;
   
	public Candidate saveCandidate(Candidate candidate) {
		System.out.println("Inside service " + candidate);
		return candidateRepository.save(candidate);
	}
}
