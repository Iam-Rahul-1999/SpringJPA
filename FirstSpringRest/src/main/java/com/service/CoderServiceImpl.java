package com.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.ResourceNotFoundException;
import com.entity.Coder;
import com.repository.CoderRepository;

@Service
public class CoderServiceImpl implements CoderService{

	@Autowired
	CoderRepository repo;

	public Coder getCoder(int cid) {
		Optional c=repo.findById(cid);
		
		Coder c1=(Coder) c.get();
		return c1;
	}

	public List<Coder> getCoders() {
		List<Coder> lc=repo.findAll();
		return lc;
	}

	public Coder addCoder(Coder c) {
		repo.save(c);
		return c;
	}

	public List<Coder> addCoders(List<Coder> lc) {
		repo.saveAll(lc);
		return lc;
	}

	public Coder updateCoder(Coder c) throws Throwable
	{
		Supplier s1=()->new ResourceNotFoundException("Coder does not exists in the databse");
		int id=c.getCid();
		Coder c1=repo.findById(id).orElseThrow(s1);
		c1.setCname(c.getCname());
		c1.setTech(c.getTech());
		repo.save(c1);
		return c1;
	}

	public String deleteCoder(Coder c) {
		repo.delete(c);
		return "Deleted";
	}

	public String deleteCoderById(int cid) throws Throwable {
		Supplier s1=()->new ResourceNotFoundException("Coder does not exists in the databse");
		Coder c2=repo.findById(cid).orElseThrow(s1);
		repo.deleteById(cid);
		return "Deleted";
	}
	
	public Coder getCoderByCname(String cname)
	{
		Coder c2=repo.getCoderByCname(cname);
		return c2;
	}
	
	public List<Coder> getCoderByTechSorted(String tech)
	{
		List<Coder> lc=repo.getCoderByTechSorted(tech);
		return lc;
	}
	
public Coder getCoderByCid(int cid) throws Throwable
	{
		Supplier s1=()->new ResourceNotFoundException("Coder does not exists in the databse");
		Coder c2=repo.findById(cid).orElseThrow(s1);
		return c2;
	}
}
