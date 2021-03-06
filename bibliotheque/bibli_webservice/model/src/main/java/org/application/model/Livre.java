package org.application.model;

import java.sql.Date;

public class Livre {


    private int id;
    private String titre;
    private Date anneeSortie;
    private int idAuteur;
    private int nbExemplaires;
    private boolean disponible;
    private Auteur auteur;
    private int nbRestant;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getAnneeSortie() {
		return anneeSortie;
	}
	public void setAnneeSortie(Date date) {
		this.anneeSortie = date;
	}
	public int getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
	}
	public int getNbExemplaires() {
		return nbExemplaires;
	}
	public void setNbExemplaires(int nbExemplaires) {
		this.nbExemplaires = nbExemplaires;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public int getNbRestant() {
		return nbRestant;
	}
	public void setNbRestant(int nbRestant) {
		this.nbRestant = nbRestant;
	}

	
    
}
