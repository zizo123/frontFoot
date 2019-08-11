package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.NationaliteRepository;
import org.tournoi.entities.Nationalite;

@RestController
@RequestMapping(value="/nationalite")
@CrossOrigin("*")
public class NationaliteRestService {
	@Autowired
	NationaliteRepository nationaliteRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Nationalite nationalite){
		nationaliteRepository.save(nationalite);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Nationalite nationalite){
		nationaliteRepository.saveAndFlush(nationalite);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		nationaliteRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Nationalite> findAll(){
		return nationaliteRepository.findAll();
	}
}
