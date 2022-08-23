package fr.m2i.backed;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LoginBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String login = "aucun";
	private boolean loginIs = false;
	


	public boolean isLoginIs() {
		return loginIs;
	}

	public void setLoginIs(boolean loginIs) {
		this.loginIs = loginIs;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public void loggin() {
		if(this.login.equals("admin")) {
			this.setLoginIs(true);
		}else {
			this.setLoginIs(false);
		}
	}

	
}
