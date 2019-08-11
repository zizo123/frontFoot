package org.tournoi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Game implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private Date dateGame;
	private int nombreSpectateur;
	@ManyToOne(cascade=CascadeType.ALL)
	private Equipe equipeA;
	@ManyToOne(cascade=CascadeType.ALL)
	private Equipe equipeB;
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne arbitre;
	@ManyToOne(cascade=CascadeType.ALL)
	private Stade stade;
	@ManyToOne(cascade=CascadeType.ALL)
	private Journee journee;
	@OneToMany(mappedBy="game",orphanRemoval=true,cascade=CascadeType.ALL)
	private List<But> buts;
	@OneToMany(mappedBy="game",orphanRemoval=true,cascade=CascadeType.ALL)
	private List<Remplacement> remplacement;
	public Game(long id, Date dateGame, int nombreSpectateur, Equipe equipeA, Equipe equipeB, Personne arbitre,
			Stade stade, Journee journee) {
		super();
		this.id = id;
		this.dateGame = dateGame;
		this.nombreSpectateur = nombreSpectateur;
		this.equipeA = equipeA;
		this.equipeB = equipeB;
		this.arbitre = arbitre;
		this.stade = stade;
		this.journee = journee;
	}
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateGame() {
		return dateGame;
	}
	public void setDateGame(Date dateGame) {
		this.dateGame = dateGame;
	}
	public int getNombreSpectateur() {
		return nombreSpectateur;
	}
	public void setNombreSpectateur(int nombreSpectateur) {
		this.nombreSpectateur = nombreSpectateur;
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
	public Personne getArbitre() {
		return arbitre;
	}
	public void setArbitre(Personne arbitre) {
		this.arbitre = arbitre;
	}
	public Stade getStade() {
		return stade;
	}
	public void setStade(Stade stade) {
		this.stade = stade;
	}
	public Journee getJournee() {
		return journee;
	}
	public void setJournee(Journee journee) {
		this.journee = journee;
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", dateGame=" + dateGame + ", nombreSpectateur=" + nombreSpectateur + ", equipeA="
				+ equipeA + ", equipeB=" + equipeB + ", arbitre=" + arbitre + ", stade=" + stade + ", journee="
				+ journee + "]";
	}
	
	
}
