package fr.m2i.backed;

import java.io.Serializable;

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
	
	@Inject
	private AutreBean ab;
	
	
	@Inject
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;
	
	@PostConstruct
	public void init() {
		
		System.out.println(ab.getMessage());
		
		
		System.out.println("Bean créé");
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
