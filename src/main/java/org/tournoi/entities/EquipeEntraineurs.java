package org.tournoi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class EquipeEntraineurs implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private Date dateDebut;
	private Date dateFin;
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne entraineur;
	@ManyToOne(cascade=CascadeType.ALL)
	private Equipe equipe;
	public EquipeEntraineurs(long id, Date dateDebut, Date dateFin, Personne entraineur, Equipe equipe) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.entraineur = entraineur;
		this.equipe = equipe;
	}
	public EquipeEntraineurs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Personne getEntraineur() {
		return entraineur;
	}
	public void setEntraineur(Personne entraineur) {
		this.entraineur = entraineur;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	@Override
	public String toString() {
		return "EquipeEntraineurs [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", entraineur="
				+ entraineur + ", equipe=" + equipe + "]";
	}
	
}
