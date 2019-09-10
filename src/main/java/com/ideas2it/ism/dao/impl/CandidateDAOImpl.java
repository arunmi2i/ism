package com.ideas2it.ism.dao.impl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ideas2it.ism.dao.CandidateRepository;
import com.ideas2it.ism.entity.Candidate;

/**
 * This layer act as an intermediate between DB and 
 * our project. This layer interacts with the Candidate 
 * table. It enable us to perform all required actions 
 * to be done in DB.
 * 
 * @author M.Mani Bharathi
 *
 */
@Repository
public class CandidateDAOImpl implements CandidateRepository{

	public <S extends Candidate> S save(S entity) {
		
		return null;
	}

	public <S extends Candidate> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Candidate> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Candidate> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Candidate> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Candidate entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Candidate> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


}