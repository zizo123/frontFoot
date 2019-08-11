package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class EquipeJoueurs implements Serializable{
	@EmbeddedId
	private EquipeJoueursPk id;
	private String poste;
	private int numMaillot;
	
	
	public EquipeJoueurs(EquipeJoueursPk id, String poste, int numMaillot) {
		super();
		this.id = id;
		this.poste = poste;
		this.numMaillot = numMaillot;
	}
	public EquipeJoueurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public int getNumMaillot() {
		return numMaillot;
	}
	public void setNumMaillot(int numMaillot) {
		this.numMaillot = numMaillot;
	}
	public EquipeJoueursPk getId() {
		return id;
	}
	public void setId(EquipeJoueursPk id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EquipeJoueurs [id=" + id + ", poste=" + poste + ", numMaillot=" + numMaillot + "]";
	}
	
	
}
