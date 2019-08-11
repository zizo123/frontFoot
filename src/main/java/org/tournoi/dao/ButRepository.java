package org.tournoi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tournoi.entities.But;

public interface ButRepository extends JpaRepository<But,Long>{
	List<But> findByGameId(Long idGame);
}
