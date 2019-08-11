package org.tournoi.util;

import org.tournoi.entities.Equipe;

public class LigneTableau {
	private Equipe equipeA;
	private Equipe equipeB;
	private int scoreA;
	private int scoreB;
	public LigneTableau(Equipe equipeA, Equipe equipeB, int scoreA, int scoreB) {
		super();
		this.equipeA = equipeA;
		this.equipeB = equipeB;
		this.scoreA = scoreA;
		this.scoreB = scoreB;
	}
	public LigneTableau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe getEquipeA() {
		return equipeA;
	}
	public void setEquipeA(Equipe equipeA) {
		this.equipeA = equipeA;
	}
	public Equipe getEquipeB() {
		return equipeB;
	}
	public void setEquipeB(Equipe equipeB) {
		this.equipeB = equipeB;
	}
	public int getScoreA() {
		return scoreA;
	}
	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}
	public int getScoreB() {
		return scoreB;
	}
	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}
	@Override
	public String toString() {
		return "LigneTableau [equipeA=" + equipeA + ", equipeB=" + equipeB + ", scoreA=" + scoreA + ", scoreB=" + scoreB
				+ "]";
	}
	
	
}
