package fr.m2i.backed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import fr.m2i.models.Products;

@Named
@SessionScoped
public class ProductBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Products> productList;

	
	


	@PostConstruct
	public void init() {
		
		this.productList = new ArrayList<>();
		this.productList.add(new Products("Pain au Chocolat","Fait maison, cuit sur place",2,1));
		this.productList.add(new Products("Croissant","Fait maison, cuit sur place",2,1));
		this.productList.add(new Products("Chocolat au lait","A base de chocolat noir 95%",3,1));
		this.productList.add(new Products("Expresso","Expresso Italien Fort",3,1));
		this.productList.add(new Products("Double Expresso","Double Expresso Italien",4,1));
		this.productList.add(new Products("Décafeinato","Expresso Italien déca",3,1));
		this.productList.add(new Products("Option lait","Capsule de lait des vaches des montagnes",1,1));
		
		System.out.println("Liste créé");
	}
	
	

	@PreDestroy
	public void destroy() {
		System.out.println("Bean détruite");
	}



	public List<Products> getProductList() {
		return productList;
	}



	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}






	
	

	

}
