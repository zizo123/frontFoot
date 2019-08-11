package org.tournoi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tournoi.entities.Saison;

public interface SaisonRepository extends JpaRepository<Saison, Long>{
	@Query("select s from Saison s"
			+ " where s.id in "
			+ "	(select c.saison.id from Championnat c "
			+ "	where c.id in "
			+ "		(select j.championnat.id from Journee j"
			+ "		 where j.id in "
			+ "			(select g.journee.id from Game g"
			+ "			 where g.id =:idGame)))")
	Saison findByIdGame(@Param("idGame") Long idGame);
}
