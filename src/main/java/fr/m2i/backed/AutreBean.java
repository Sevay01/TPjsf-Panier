package fr.m2i.backed;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AutreBean implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String message = "hey hey hey";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
