package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
@Embeddable
public class EquipeJoueursPk implements Serializable{
	@ManyToOne(cascade=CascadeType.ALL)
	private Equipe equipe;	
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne joueur;
	@ManyToOne(cascade=CascadeType.ALL)
	private Saison saison;
	public EquipeJoueursPk(Equipe equipe, Personne joueur) {
		super();
		this.equipe = equipe;
		this.joueur = joueur;
	}
	
	public EquipeJoueursPk(Equipe equipe, Personne joueur, Saison saison) {
		super();
		this.equipe = equipe;
		this.joueur = joueur;
		this.saison = saison;
	}

	public EquipeJoueursPk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public Personne getJoueur() {
		return joueur;
	}
	public void setJoueur(Personne joueur) {
		this.joueur = joueur;
	}

	public Saison getSaison() {
		return saison;
	}

	public void setSaison(Saison saison) {
		this.saison = saison;
	}

	@Override
	public String toString() {
		return "EquipeJoueursPk [equipe=" + equipe + ", joueur=" + joueur + ", saison=" + saison + "]";
	}
	
}
