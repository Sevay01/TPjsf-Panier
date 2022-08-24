package fr.m2i.backed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import fr.m2i.models.Products;

@Named
@SessionScoped
public class PanierBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Products> pannierList;
	private String total = "0";
	
	


	@PostConstruct
	public void init() {
		
		this.pannierList = new ArrayList<>();
	
		
		System.out.println("Liste créé");
	}
	
	

	@PreDestroy
	public void destroy() {
		System.out.println("Bean détruite");
	}

	
	public List<Products> getPannierList() {
		return pannierList;

	}



	public void setPannierList(List<Products> pannierList) {
		this.pannierList = pannierList;
	}



	public void setTotal(String total) {
		this.total = total;
	}



	public String getTotal() {
		return total;
	}
	
	public void addProduct(Products product){
		if(!pannierList.contains(product)){
			pannierList.add(product);
			
		}
		else {
			for (Products art:pannierList) {
				if(art.getNom().equals(product.getNom())){
					art.setQuantity(art.getQuantity()+1);
				}
			}
		}
	
		System.out.println("coucou");
		System.out.println(pannierList.size());
	}

	
	public void delProduct(Products product){
	
		for (Products art:pannierList) {
			if(art.getNom().equals(product.getNom()) && (art.getQuantity() > 0)){
				art.setQuantity(art.getQuantity()-1);
			}
		}
		if(product.getQuantity() <1){
			pannierList.remove(product);
			
		}
		
	}
	
	public void destroyPannier(){
		this.pannierList = new ArrayList<>();
	}
	
	
	
	
	public Integer prixTotal(){
		Integer total = 0;
		for (Products article:pannierList) {
			total += article.getPrix() * article.getQuantity();
		}
		return total;
	}
	
	

}
