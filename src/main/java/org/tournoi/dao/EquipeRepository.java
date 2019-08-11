package org.tournoi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tournoi.entities.Equipe;
import org.tournoi.entities.EquipeJoueurs;

public interface EquipeRepository extends JpaRepository<Equipe, Long>{
	@Query("select ej from EquipeJoueurs ej "
			+ "where ej.id.saison.id=:idSaison and ej.id.joueur.id=:idEquipe")
	List<EquipeJoueurs> getCompositionEquipe(@Param("idEquipe")Long idEquipe,@Param("idSaison")Long idSaison);
}
