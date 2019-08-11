package org.tournoi.util;

import org.tournoi.entities.Equipe;

public class LigneClassement {
	private Equipe equipe ;
	private int points;
	
	public LigneClassement(Equipe equipe, int points) {
		super();
		this.equipe = equipe;
		this.points = points;
	}
	
	public LigneClassement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Equipe getEquipe() {
		return equipe;
	}
	
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "LigneClassement [equipe=" + equipe + ", points=" + points + "]";
	}
	
}
