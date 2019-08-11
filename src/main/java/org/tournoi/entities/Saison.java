package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Saison implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String libelle;
	@ManyToOne(cascade=CascadeType.ALL)
	private Bareme bareme;
	
	
	public Saison(long id, String libelle, Bareme bareme) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.bareme = bareme;
	}
	public Saison(long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	public Saison() {
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
	public Bareme getBareme() {
		return bareme;
	}
	public void setBareme(Bareme bareme) {
		this.bareme = bareme;
	}
	@Override
	public String toString() {
		return "Saison [id=" + id + ", libelle=" + libelle + ", bareme=" + bareme + "]";
	}
	
}
