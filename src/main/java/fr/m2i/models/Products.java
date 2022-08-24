package fr.m2i.models;

import java.beans.JavaBean;

@JavaBean
public class Products {
	private String nom;
	private String description;
	private Integer prix;
	private Integer quantity;
	
	
	public Products(String nom, String description, Integer prix) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	
	}
	public Products(String nom, String description, Integer prix, Integer quantity) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.quantity = quantity;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Products [nom=" + nom + ", description=" + description + ", prix=" + prix + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
