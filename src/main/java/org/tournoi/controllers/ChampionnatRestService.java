package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.ChampionnatRepository;
import org.tournoi.entities.Championnat;

@RestController
@RequestMapping(value="/championnat")
@CrossOrigin("*")
public class ChampionnatRestService {
	@Autowired
	ChampionnatRepository championnatRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Championnat championnat){
		championnatRepository.save(championnat);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Championnat championnat){
		championnatRepository.saveAndFlush(championnat);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		championnatRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Championnat> findAll(){
		return championnatRepository.findAll();
	}
}
