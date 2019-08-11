package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.RemplacementRepository;
import org.tournoi.entities.Remplacement;

@RestController
@RequestMapping(value="/remplacement")
@CrossOrigin("*")
public class RemplacementRestService {
	@Autowired
	RemplacementRepository remplacementRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Remplacement remplacement){
		remplacementRepository.save(remplacement);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Remplacement remplacement){
		remplacementRepository.saveAndFlush(remplacement);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		remplacementRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Remplacement> findAll(){
		return remplacementRepository.findAll();
	}
}
