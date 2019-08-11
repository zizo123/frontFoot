package org.tournoi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tournoi.entities.Championnat;

public interface ChampionnatRepository extends JpaRepository<Championnat, Long>{

}
