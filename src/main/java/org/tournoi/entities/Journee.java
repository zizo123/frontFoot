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
public class Journee implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private int numero;
	@ManyToOne(cascade=CascadeType.ALL)
	private Championnat championnat;
	public Journee(long id, int numero, Championnat championnat) {
		super();
		this.id = id;
		this.numero = numero;
		this.championnat = championnat;
	}
	public Journee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Championnat getChampionnat() {
		return championnat;
	}
	public void setChampionnat(Championnat championnat) {
		this.championnat = championnat;
	}
	@Override
	public String toString() {
		return "Journee [id=" + id + ", numero=" + numero + ", championnat=" + championnat + "]";
	}
	
	
}
