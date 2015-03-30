package media.orthophonie.dto;

public class Adresse {

	private Long idAdresse;
	private String rue1;
	private String rue2;
	private int codePostal;
	private String region;
	private String ville;
	
	
	public Adresse() {
		super();
	}


	public Adresse(String rue1, String rue2, int codePostal, String region,
			String ville) {
		super();
		this.rue1 = rue1;
		this.rue2 = rue2;
		this.codePostal = codePostal;
		this.region = region;
		this.ville = ville;
	}


	public Long getIdAdresse() {
		return idAdresse;
	}


	public void setIdAdresse(Long idAdresse) {
		this.idAdresse = idAdresse;
	}


	public String getRue1() {
		return rue1;
	}


	public void setRue1(String rue1) {
		this.rue1 = rue1;
	}


	public String getRue2() {
		return rue2;
	}


	public void setRue2(String rue2) {
		this.rue2 = rue2;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
}
