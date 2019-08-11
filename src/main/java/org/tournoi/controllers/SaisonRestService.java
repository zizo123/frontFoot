package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.SaisonRepository;
import org.tournoi.entities.Saison;

@RestController
@RequestMapping(value="/saison")
@CrossOrigin("*")
public class SaisonRestService {
	@Autowired
	SaisonRepository saisonRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Saison saison){
		saisonRepository.save(saison);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Saison saison){
		saisonRepository.saveAndFlush(saison);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		saisonRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Saison> findAll(){
		return saisonRepository.findAll();
	}
}
