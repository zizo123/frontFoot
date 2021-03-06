package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.StadeRepository;
import org.tournoi.entities.Stade;

@RestController
@RequestMapping(value="/stade")
@CrossOrigin("*")
public class StadeRestService {
	@Autowired
	StadeRepository stadeRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Stade stade){
		stadeRepository.save(stade);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Stade stade){
		stadeRepository.saveAndFlush(stade);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		stadeRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Stade> findAll(){
		return stadeRepository.findAll();
	}
}
