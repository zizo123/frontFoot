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
public class Personne implements Serializable{
	@Id
	@GeneratedValue
	private long id ;
	private String nom;
	private String prenom;
	private String Type;
	@ManyToOne(cascade=CascadeType.ALL)
	private Nationalite nationalite;
	public Personne(long id, String nom, String prenom, String type, Nationalite nationalite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		Type = type;
		this.nationalite = nationalite;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Nationalite getNationalite() {
		return nationalite;
	}
	public void setNationalite(Nationalite nationalite) {
		this.nationalite = nationalite;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", Type=" + Type + ", nationalite="
				+ nationalite + "]";
	}

}
