package com.marketing.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing.entities.Real;
import com.marketing.repositories.RealRepository;

@RestController
@RequestMapping("/api/reals")
public class RealRestController {
	
	@Autowired
	private RealRepository realRepo;
	
	@GetMapping
	public List<Real>getAllReals(){
		List<Real> reals = realRepo.findAll();
		return reals;
	}
	@PostMapping
	public void saveOneReal(@RequestBody Real real) {
		realRepo.save(real);
	}
	@PutMapping
	public void updateOneReal(@RequestBody Real real) {
		realRepo.save(real);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteOneReal(@PathVariable("id")long id) {
		realRepo.deleteById(id);
	}
	//localhost:8080/api/reals/6
	@RequestMapping("/find/{id}")
	public Real getOneReal(@PathVariable("id")long id) {
		Optional<Real> findById=realRepo.findById(id);
		
		Real real = findById.get();
		return real;
		
	}
	
	
}
