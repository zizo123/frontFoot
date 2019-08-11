package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stade implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String nomStade;
	private int nombrePlace;
	public Stade(long id, String nomStade, int nombrePlace) {
		super();
		this.id = id;
		this.nomStade = nomStade;
		this.nombrePlace = nombrePlace;
	}
	public Stade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomStade() {
		return nomStade;
	}
	public void setNomStade(String nomStade) {
		this.nomStade = nomStade;
	}
	public int getNombrePlace() {
		return nombrePlace;
	}
	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}
	@Override
	public String toString() {
		return "Stade [id=" + id + ", nomStade=" + nomStade + ", nombrePlace=" + nombrePlace + "]";
	}
	
}
