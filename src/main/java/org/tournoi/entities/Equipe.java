package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipe implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String nomEquipe;
	public Equipe(long id, String nomEquipe) {
		super();
		this.id = id;
		this.nomEquipe = nomEquipe;
	}
	public Equipe() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nomEquipe=" + nomEquipe + "]";
	}
	
	
}
