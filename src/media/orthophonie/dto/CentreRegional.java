package media.orthophonie.dto;

public class CentreRegional {
	private long idcentre ;
	private int codecentre ;
	private String nomcentre ;
	private String adressecentre ;
	
	public CentreRegional() {
		super();
	}

	public CentreRegional(int codecentre, String nomcentre,
			String adressecentre) {
		super();
		this.codecentre = codecentre;
		this.nomcentre = nomcentre;
		this.adressecentre = adressecentre;
	}

	public long getIdcentre() {
		return idcentre;
	}

	public void setIdcentre(long idcentre) {
		this.idcentre = idcentre;
	}

	public int getCodecentre() {
		return codecentre;
	}

	public void setCodecentre(int codecentre) {
		this.codecentre = codecentre;
	}

	public String getNomcentre() {
		return nomcentre;
	}

	public void setNomcentre(String nomcentre) {
		this.nomcentre = nomcentre;
	}

	public String getAdressecentre() {
		return adressecentre;
	}

	public void setAdressecentre(String adressecentre) {
		this.adressecentre = adressecentre;
	}
	
	

}
