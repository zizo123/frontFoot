package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nationalite implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String nation;
	public Nationalite(long id, String nation) {
		super();
		this.id = id;
		this.nation = nation;
	}
	public Nationalite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "Nationalite [id=" + id + ", nation=" + nation + "]";
	}
	
	
}
