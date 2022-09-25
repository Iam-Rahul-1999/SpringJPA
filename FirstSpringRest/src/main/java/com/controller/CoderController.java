package com.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Coder;
import com.entity.Laptop;
import com.service.CoderService;

@RestController
@RequestMapping("api")
public class CoderController {

	@Autowired
	CoderService coderservice;
	
	@GetMapping("/getCoder/{cid}")
	public Coder getCoder(@PathVariable  int cid)
	{
		Coder c1=coderservice.getCoder(cid);
		
		return c1;
		
	}
	
	@GetMapping("/getCoders")
	public List<Coder> getCoders()
	{
		List<Coder> c1=coderservice.getCoders();
		return c1;
		
	}
	
	@PostMapping("addcoders")
	public List<Coder> addCoders(@RequestBody List<Coder> lc)
	{
		List<Coder> lc1=coderservice.addCoders(lc);
		return lc1;
	}
	
	@PostMapping("addcoder")
	public Coder addCoders(@RequestBody Coder c)
	{
		Coder c1=coderservice.addCoder(c);
		return c1;
	}
	
	@PutMapping("/updatecoder")
	public Coder updateCoder(@RequestBody  Coder c) throws Throwable
	{
		Coder c1=coderservice.updateCoder(c);
		return c1;
	}
	
	@DeleteMapping("/deletecoder")
	public String deleteCoder(@RequestBody  Coder c)
	{
		String s=coderservice.deleteCoder(c);
		return s;
	}
	
	@DeleteMapping("/deletecoderById/{cid}")
	public String deleteCoderById(@PathVariable  int cid) throws Throwable
	{
		String s=coderservice.deleteCoderById(cid);
		return s;
	}
	
	@GetMapping("getcoderbyname/{cname}")
	public Coder getCoderByCname(@PathVariable String cname)
	{
		Coder c2=coderservice.getCoderByCname(cname);
		return c2;
	}
	
	@GetMapping("getcoderbytech/{tech}")
	public List<Coder> getCoderByTechSorted(@PathVariable String tech)
	{
		List<Coder> lc=coderservice.getCoderByTechSorted(tech);
		return lc;
	}
	
	@GetMapping("getcoderbyid/{cid}")
	public Coder getCoderByCid(@PathVariable int cid) throws Throwable
	{
		Coder c2=coderservice.getCoderByCid(cid);
		return c2;
	}
	
}
