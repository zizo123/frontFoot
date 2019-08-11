package org.tournoi.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bareme implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private int baremeNul;
	private int baremeVictoire;
	private int baremeDefaite; 
	
	public Bareme(long id, int baremeNul, int baremeVictoire, int baremeDefaite, Saison saison,
			Championnat championnat) {
		super();
		this.id = id;
		this.baremeNul = baremeNul;
		this.baremeVictoire = baremeVictoire;
		this.baremeDefaite = baremeDefaite;
	}
	public Bareme() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getBaremeNul() {
		return baremeNul;
	}
	public void setBaremeNul(int baremeNul) {
		this.baremeNul = baremeNul;
	}
	public int getBaremeVictoire() {
		return baremeVictoire;
	}
	public void setBaremeVictoire(int baremeVictoire) {
		this.baremeVictoire = baremeVictoire;
	}
	public int getBaremeDefaite() {
		return baremeDefaite;
	}
	public void setBaremeDefaite(int baremeDefaite) {
		this.baremeDefaite = baremeDefaite;
	}
	@Override
	public String toString() {
		return "Bareme [id=" + id + ", baremeNul=" + baremeNul + ", baremeVictoire=" + baremeVictoire
				+ ", baremeDefaite=" + baremeDefaite + "]";
	}
	
}
