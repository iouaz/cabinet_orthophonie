package media.orthophonie.dto;

import java.util.List;

public class Utilisateur {

	private Long idUtilisateur;
	private String nomUser;
	private String prenomUser;
	private int telUser;
	private String login;
	private String password;
	
	private List<Role> roles;
	
	public Utilisateur() {
		super();
	}


	public Utilisateur(String nomUser, String prenomUser, int telUser,
			String login, String password) {
		super();
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.telUser = telUser;
		this.login = login;
		this.password = password;
	}


	public Long getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getNomUser() {
		return nomUser;
	}


	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}


	public String getPrenomUser() {
		return prenomUser;
	}


	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}


	public int getTelUser() {
		return telUser;
	}


	public void setTelUser(int telUser) {
		this.telUser = telUser;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
}
