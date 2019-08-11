package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.GameRepository;
import org.tournoi.entities.Game;

@RestController
@RequestMapping(value="/game")
@CrossOrigin("*")
public class GameRestService {
	@Autowired
	GameRepository gameRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Game game){
		gameRepository.save(game);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Game game){
		gameRepository.saveAndFlush(game);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		gameRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Game> findAll(){
		return gameRepository.findAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Game findById(@PathVariable long id){
		return gameRepository.findOne(id);
	}
}
