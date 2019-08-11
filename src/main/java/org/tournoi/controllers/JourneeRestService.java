package org.tournoi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tournoi.dao.ChampionnatEquipesRepository;
import org.tournoi.dao.GameRepository;
import org.tournoi.dao.JourneeRepository;
import org.tournoi.entities.ChampionnatEquipes;
import org.tournoi.entities.Game;
import org.tournoi.entities.Journee;
import org.tournoi.util.LigneClassement;
import org.tournoi.util.LigneTableau;

@RestController
@RequestMapping(value="/journee")
@CrossOrigin("*")
public class JourneeRestService {
	@Autowired
	JourneeRepository journeeRepository;
	@Autowired
	GameRepository gameRepository;
	@Autowired
	ChampionnatEquipesRepository championnatEquipesRepository;
	
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public void save(@RequestBody Journee journee){
		journeeRepository.save(journee);
	}
	@RequestMapping(value="",method=RequestMethod.PUT)
	public void update(@RequestBody Journee journee){
		journeeRepository.saveAndFlush(journee);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		journeeRepository.delete(id);
	}
	@RequestMapping(value="",method=RequestMethod.GET)
	public List<Journee> findAll(){
		return journeeRepository.findAll();
	}
	@RequestMapping(value="/resultTable/{idJournee}",method=RequestMethod.GET)
	public List<LigneTableau> listResultTable(@PathVariable long idJournee){
		List<LigneTableau> listLigneTable=new ArrayList<LigneTableau>();
		LigneTableau ligneTable;
		List<Game>  listGames= gameRepository.findByJourneeId(idJournee);
		for(Game game:listGames){
			ligneTable=new LigneTableau(game.getEquipeA(), game.getEquipeB()
					, gameRepository.getScore(game.getEquipeA().getId(), game.getId())
					, gameRepository.getScore(game.getEquipeB().getId(), game.getId()));
			listLigneTable.add(ligneTable);
		}
		return listLigneTable;
	}
	@RequestMapping(value="/classementTable/{idJournee}",method=RequestMethod.GET)
	public List<LigneClassement> listClassement(@PathVariable long idJournee){
		List<LigneTableau> listLigneTable= new ArrayList<LigneTableau>();
		List<LigneClassement> listClassement=new ArrayList<LigneClassement>();
		List<Journee> listJournee=journeeRepository.findByChampionnatId(journeeRepository.findOne(idJournee).getChampionnat().getId());
		List<ChampionnatEquipes> listChampionnatEquipes=championnatEquipesRepository.findByIdChampionnatId(journeeRepository.findOne(idJournee).getChampionnat().getId());
		for(ChampionnatEquipes ce:listChampionnatEquipes){
			listClassement.add(new LigneClassement(ce.getId().getEquipe(), 0));
		}
		System.out.println(listClassement);
		for(Journee journee:listJournee){
			listLigneTable=listResultTable(journee.getId());
			System.out.println(listLigneTable);
			for(LigneTableau lt:listLigneTable){
				if(lt.getScoreA()>lt.getScoreB()){
					for(LigneClassement lc:listClassement){
						if(lc.getEquipe().getId()==lt.getEquipeA().getId()){
							lc.setPoints(lc.getPoints()+journee.getChampionnat().getSaison().getBareme().getBaremeVictoire());
							break;
						}
					}
					continue;
				}else if(lt.getScoreA()==lt.getScoreB()){
					for(LigneClassement lc:listClassement){
						if(lc.getEquipe().getId()==lt.getEquipeB().getId()){
							System.out.println(journee.getChampionnat().getSaison().getBareme().getBaremeNul());
							lc.setPoints(lc.getPoints()+journee.getChampionnat().getSaison().getBareme().getBaremeNul());
							//break;
						}
						if(lc.getEquipe().getId()==lt.getEquipeA().getId()){
							System.out.println(journee.getChampionnat().getSaison().getBareme().getBaremeNul());
							lc.setPoints(lc.getPoints()+journee.getChampionnat().getSaison().getBareme().getBaremeNul());
						}
					}
					continue;
				}else if(lt.getScoreA()<lt.getScoreB()){
					for(LigneClassement lc:listClassement){
						if(lc.getEquipe().getId()==lt.getEquipeB().getId()){
							lc.setPoints(lc.getPoints()+journee.getChampionnat().getSaison().getBareme().getBaremeVictoire());
							break;
						}
					}
					continue;
				}
			}
		}
		return listClassement;
	}
}
