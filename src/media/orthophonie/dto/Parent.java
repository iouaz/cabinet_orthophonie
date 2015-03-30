package media.orthophonie.dto;

import java.util.List;

public class Parent {

	private Long idParent;
	private String cinParent;
	private String nomParent;
	private String prenomParent;
	private String prefession;
	private int tel;
	private Boolean assure;
	private int nbrEnfant;
	private int nbrEnfantOrthophonique;
	
	private List<Patient> enfants;
	private Adresse adresse;
	
	public Parent() {
		super();
	}

	public Parent(String cinParent, String nomParent, String prenomParent,
			String prefession, int tel, Boolean assure, int nbrEnfant,
			int nbrEnfantOrthophonique) {
		super();
		this.cinParent = cinParent;
		this.nomParent = nomParent;
		this.prenomParent = prenomParent;
		this.prefession = prefession;
		this.tel = tel;
		this.assure = assure;
		this.nbrEnfant = nbrEnfant;
		this.nbrEnfantOrthophonique = nbrEnfantOrthophonique;
	}

	public Long getIdParent() {
		return idParent;
	}

	public void setIdParent(Long idParent) {
		this.idParent = idParent;
	}

	public String getCinParent() {
		return cinParent;
	}

	public void setCinParent(String cinParent) {
		this.cinParent = cinParent;
	}

	public String getNomParent() {
		return nomParent;
	}

	public void setNomParent(String nomParent) {
		this.nomParent = nomParent;
	}

	public String getPrenomParent() {
		return prenomParent;
	}

	public void setPrenomParent(String prenomParent) {
		this.prenomParent = prenomParent;
	}

	public String getPrefession() {
		return prefession;
	}

	public void setPrefession(String prefession) {
		this.prefession = prefession;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public Boolean getAssure() {
		return assure;
	}

	public void setAssure(Boolean assure) {
		this.assure = assure;
	}

	public int getNbrEnfant() {
		return nbrEnfant;
	}

	public void setNbrEnfant(int nbrEnfant) {
		this.nbrEnfant = nbrEnfant;
	}

	public int getNbrEnfantOrthophonique() {
		return nbrEnfantOrthophonique;
	}

	public void setNbrEnfantOrthophonique(int nbrEnfantOrthophonique) {
		this.nbrEnfantOrthophonique = nbrEnfantOrthophonique;
	}

	public List<Patient> getEnfants() {
		return enfants;
	}

	public void setEnfants(List<Patient> enfants) {
		this.enfants = enfants;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
	
}
