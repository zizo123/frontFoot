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
public class Remplacement implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private int minute;
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne joueurIn;
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne joueurOut;
	@ManyToOne(cascade=CascadeType.ALL)
	private Game game;
	public Remplacement(long id, int minute, Personne joueurIn, Personne joueurOut) {
		super();
		this.id = id;
		this.minute = minute;
		this.joueurIn = joueurIn;
		this.joueurOut = joueurOut;
	}
	public Remplacement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public Personne getJoueurIn() {
		return joueurIn;
	}
	public void setJoueurIn(Personne joueurIn) {
		this.joueurIn = joueurIn;
	}
	public Personne getJoueurOut() {
		return joueurOut;
	}
	public void setJoueurOut(Personne joueurOut) {
		this.joueurOut = joueurOut;
	}
	@Override
	public String toString() {
		return "Remplacement [id=" + id + ", minute=" + minute + ", joueurIn=" + joueurIn + ", joueurOut=" + joueurOut
				+ "]";
	}
	
}
