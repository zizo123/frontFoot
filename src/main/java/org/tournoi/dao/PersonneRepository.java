package org.tournoi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tournoi.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
