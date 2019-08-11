package org.tournoi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tournoi.entities.Journee;

public interface JourneeRepository extends JpaRepository<Journee, Long>{
	List<Journee> findByChampionnatId(Long idChampionnat);
}
