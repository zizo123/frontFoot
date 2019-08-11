package org.tournoi.controllers;

import java.util.List;

import javax.persistence.Access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.PersonneRepository;
import org.tournoi.entities.Personne;

@RestController
@RequestMapping(value="/personne")
@CrossOrigin("*")
public class PersonneRestService {
	@Autowired
	PersonneRepository personneRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Personne personne){
		personneRepository.save(personne);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Personne personne){
		personneRepository.saveAndFlush(personne);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		personneRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Personne> findAll(){
		return personneRepository.findAll();
	}
}
