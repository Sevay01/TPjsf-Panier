package fr.m2i.backed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<String> maListe;
	
	@Inject
	private AutreBean ab;
	
	
	@Inject
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;
	
	@PostConstruct
	public void init() {
		
		this.maListe = new ArrayList<>();
		this.maListe.add("Tata");
		this.maListe.add("Toto");
		this.maListe.add("Titi");
		
		
		
		System.out.println(ab.getMessage());
		
		
		System.out.println("Bean créé");
	}
	
	public List<String> getMaListe() {
		return maListe;
	}

	public void setMaListe(List<String> maListe) {
		this.maListe = maListe;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean détruite");
	}
	
	private String nom = "heb";
	private String prenom = "fre";
	
	
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
	
	
	public void returnResult() {
		
		System.out.println("Je suis passé par la : "+this.nom);
		
	}
	
	public String page() {
		
	
		return this.pageId;
		
		//si j'ai 
	}
	

}
