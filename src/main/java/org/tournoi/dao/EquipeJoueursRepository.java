package org.tournoi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tournoi.entities.EquipeJoueurs;
import org.tournoi.entities.EquipeJoueursPk;

public interface EquipeJoueursRepository extends JpaRepository<EquipeJoueurs, EquipeJoueursPk>{
	EquipeJoueurs findByIdJoueurIdAndIdSaisonId(Long idPersonne ,Long idSaison);
}
