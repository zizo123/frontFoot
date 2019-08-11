package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Embeddable
public class GameJoueursPk implements Serializable{
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Game game;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne joueur;

	public GameJoueursPk(Game game, Personne joueur) {
		super();
		this.game = game;
		this.joueur = joueur;
	}

	public GameJoueursPk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Personne getJoueur() {
		return joueur;
	}

	public void setJoueur(Personne joueur) {
		this.joueur = joueur;
	}

	@Override
	public String toString() {
		return "GameJoueursPk [game=" + game + ", joueur=" + joueur + "]";
	}

	
}
