package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Championnat implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String libelle;
	@ManyToOne(cascade=CascadeType.ALL)
	private Saison saison;
	public Championnat(long id, String libelle,  Saison saison) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.saison = saison;
	}
	public Championnat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public Saison getSaison() {
		return saison;
	}
	public void setSaison(Saison saison) {
		this.saison = saison;
	}
	@Override
	public String toString() {
		return "Championnat [id=" + id + ", libelle=" + libelle + ", saison=" + saison + "]";
	}
	
	
}
