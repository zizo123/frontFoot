package org.tournoi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tournoi.entities.ChampionnatEquipes;
import org.tournoi.entities.ChampionnatEquipesPk;

public interface ChampionnatEquipesRepository extends JpaRepository<ChampionnatEquipes, ChampionnatEquipesPk>{
	List<ChampionnatEquipes> findByIdChampionnatId(Long idChampionnat);
}
