package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.BaremeRepository;
import org.tournoi.entities.Bareme;

@RestController
@RequestMapping(value="/bareme")
@CrossOrigin("*")
public class BaremeRestService {
	@Autowired
	BaremeRepository baremeRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Bareme bareme){
		baremeRepository.save(bareme);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Bareme bareme){
		baremeRepository.saveAndFlush(bareme);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		baremeRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Bareme> findAll(){
		return baremeRepository.findAll();
	}
	
}
