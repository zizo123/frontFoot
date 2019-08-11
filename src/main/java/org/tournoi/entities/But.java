package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
@Entity
public class But implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private int minute;
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne joueur;
	@ManyToOne(cascade=CascadeType.ALL)
	private Game game;
	public But(long id, int minute, Personne joueur, Game game) {
		super();
		this.id = id;
		this.minute = minute;
		this.joueur = joueur;
		this.game = game;
	}
	public But() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public Personne getJoueur() {
		return joueur;
	}
	public void setJoueur(Personne joueur) {
		this.joueur = joueur;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	@Override
	public String toString() {
		return "But [id=" + id + ", minute=" + minute + ", joueur=" + joueur + ", game=" + game + "]";
	}
	
	
}
