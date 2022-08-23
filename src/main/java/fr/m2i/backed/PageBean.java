package fr.m2i.backed;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;



@Named
@SessionScoped
public class PageBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String page = "index.xhtml";

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	
}
