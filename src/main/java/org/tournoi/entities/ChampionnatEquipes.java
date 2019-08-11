package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ChampionnatEquipes implements Serializable{
	@EmbeddedId
	private ChampionnatEquipesPk id;

	public ChampionnatEquipes(ChampionnatEquipesPk id) {
		super();
		this.id = id;
	}

	public ChampionnatEquipes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChampionnatEquipesPk getId() {
		return id;
	}

	public void setId(ChampionnatEquipesPk id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ChampionnatEquipes [id=" + id + "]";
	}
	
	
}
