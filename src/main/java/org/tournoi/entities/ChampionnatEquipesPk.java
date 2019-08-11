package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ChampionnatEquipesPk implements Serializable{
	@ManyToOne(cascade=CascadeType.ALL)
	private Equipe equipe;
	@ManyToOne(cascade=CascadeType.ALL)
	private Championnat championnat;
	public ChampionnatEquipesPk(Equipe equipe, Championnat championnat) {
		super();
		this.equipe = equipe;
		this.championnat = championnat;
	}
	public ChampionnatEquipesPk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public Championnat getChampionnat() {
		return championnat;
	}
	public void setChampionnat(Championnat championnat) {
		this.championnat = championnat;
	}
	@Override
	public String toString() {
		return "ChampionnatEquipesPk [equipe=" + equipe + ", championnat=" + championnat + "]";
	}
	
	
}
