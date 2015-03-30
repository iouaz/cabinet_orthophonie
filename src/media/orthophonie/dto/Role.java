package media.orthophonie.dto;

import java.util.List;

public class Role {
	
	private long idrole ;
	private String libellerole ;
	
	private List<Utilisateur> utilisateurs;
	
	public Role() {
		super();
	}

	public Role(String libellerole) {
		super();
		this.libellerole = libellerole;
	}

	public long getIdrole() {
		return idrole;
	}

	public void setIdrole(long idrole) {
		this.idrole = idrole;
	}

	public String getLibellerole() {
		return libellerole;
	}

	public void setLibellerole(String libellerole) {
		this.libellerole = libellerole;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	

}
