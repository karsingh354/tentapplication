package com.tentbookingdetails.tentbookingdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DetailsService {

	@Autowired
	private DetailsRepostary repo;
	
	public List<Details> listAll() {
		return repo.findAll();
	}
	
	public void save(Details details) {
		repo.save(details);
	}
	
	public Details get(int customerid) {
		return repo.findById(customerid).get();
	}
	
	public void delete(int customerid) {
		repo.deleteById(customerid);
	}
}