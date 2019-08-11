package org.tournoi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tournoi.entities.GameJoueurs;
import org.tournoi.entities.GameJoueursPk;

public interface GameJoueursRepository extends JpaRepository<GameJoueurs, GameJoueursPk>{

}
