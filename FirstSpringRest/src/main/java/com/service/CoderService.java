package com.service;

import java.util.List;

import com.entity.Coder;

public interface CoderService {

	public Coder getCoder(int cid);
	
	public List<Coder> getCoders();
	
	public Coder addCoder(Coder c);
	
	public List<Coder> addCoders(List<Coder> lc);
	
	public Coder updateCoder(Coder c) throws Throwable;
	
	public String deleteCoder(Coder c);
	
	public String deleteCoderById(int cid) throws Throwable;
	
	public Coder getCoderByCname(String cname);
	
	public List<Coder> getCoderByTechSorted(String tech);
	
	public Coder getCoderByCid(int cid) throws Throwable;
}
