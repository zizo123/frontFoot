package org.tournoi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tournoi.entities.Game;
import org.tournoi.entities.Personne;

public interface GameRepository extends JpaRepository<Game, Long>{
	@Query("select p from Personne p where id in "
			+ "(select gj.id from GameJoueurs gj where gj.id.game.id=:idGame) "
			+ "and id in (select ej.id.joueur.id from EquipeJoueurs ej "
			+ "		where ej.id.equipe.id=:idEquipe)")
	List<Personne> getCompositionEquipe(@Param("idEquipe")Long idEquipe,@Param("idGame")Long idGame);
	List<Game> findByJourneeId(Long idJournee);
	@Query("select count(b) from But b where b.game.id=:idGame and joueur.id in "
			+ " (select ej.id.joueur.id from EquipeJoueurs ej"
			+ "		where ej.id.equipe.id=:idEquipe)")
	int getScore(@Param("idEquipe")Long idEquipe,@Param("idGame")Long idGame);
	
}
