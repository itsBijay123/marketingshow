package com.marketing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Real;
import com.marketing.repositories.RealRepository;
@Service
public class RealServiceImpl implements RealService {

	@Autowired
	private RealRepository realRepo;
	@Override
	public void saveOneReal(Real real) {
     		realRepo.save(real);
	}
	@Override
	public List<Real> getAllReals() {
		List<Real>reals=realRepo.findAll();
		return reals;
	}
	@Override
	public void deleteReal(long id) {
        realRepo.deleteById(id);		
	}
	@Override
	public Real getRealById(long id) {
		Optional<Real> findById = realRepo.findById(id);
		Real real=findById.get();
		return real;
	}

}
