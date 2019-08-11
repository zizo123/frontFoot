package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class GameJoueurs implements Serializable{
	@EmbeddedId
	private GameJoueursPk id;
	
	public GameJoueurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameJoueurs(GameJoueursPk id) {
		super();
		this.id = id;
	}

	public GameJoueursPk getId() {
		return id;
	}

	public void setId(GameJoueursPk id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "GameJoueurs [id=" + id + "]";
	}
	
	
	
}
