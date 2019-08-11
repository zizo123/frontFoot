package org.tournoi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.EquipeRepository;
import org.tournoi.dao.GameRepository;
import org.tournoi.entities.Equipe;
import org.tournoi.entities.EquipeJoueurs;
import org.tournoi.entities.Personne;

@RestController
@RequestMapping(value="/equipe")
@CrossOrigin("*")
public class EquipeRestService {
	@Autowired
	EquipeRepository equipeRepository;
	@Autowired
	GameRepository gameRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Equipe equipe){
		equipeRepository.save(equipe);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Equipe equipe){
		equipeRepository.saveAndFlush(equipe);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		equipeRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Equipe> findAll(){
		return equipeRepository.findAll();
	}
	@RequestMapping(value="/CompositonParEquipe/{idEquipe}/{idSaison}",method=RequestMethod.GET)
	public List<EquipeJoueurs> listCompositionParSaison(@PathVariable Long idEquipe,@PathVariable Long idSaison){
		return equipeRepository.getCompositionEquipe(idEquipe, idSaison);
	}
	@RequestMapping(value="/CompositonParGame/{idEquipe}/{idGame}",method=RequestMethod.GET)
	public List<Personne> listCompositionParGame(@PathVariable Long idEquipe,@PathVariable Long idGame){
		return gameRepository.getCompositionEquipe(idEquipe, idGame);
	}
	
}
