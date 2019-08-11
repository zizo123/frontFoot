package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.ButRepository;
import org.tournoi.entities.But;

@RestController
@RequestMapping(value="/but")
@CrossOrigin("*")
public class ButRestService {
	@Autowired
	ButRepository butRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody But but){
		butRepository.save(but);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody But but){
		butRepository.saveAndFlush(but);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		butRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<But> findAll(){
		return butRepository.findAll();
	}
}
