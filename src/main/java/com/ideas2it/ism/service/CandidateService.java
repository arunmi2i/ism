package com.ideas2it.ism.service;

import com.ideas2it.ism.entity.Candidate;

/**
 * All the request passed from jsp are recieved at controller,
 * the action between controller and DAO layer is controlled here
 * any modifications , logics required are performed here.
 * 
 * @author M.Mani Bharathi
 *
 */
public interface CandidateService {
	
	/**
	 * Recruiter entered candidate informations are obtained
	 * as an candidate object.Then the object is passed to 
	 * DAO layer to store it in DB.
	 * 
	 * @param candidate - Recruiter entered informations are passed 
	 * as candidate object. 
	 * @return candidate - Saved candidate object is fetched from db
	 * from the generated id.
	 */
	public Candidate saveCandidate(Candidate candidate);

}
