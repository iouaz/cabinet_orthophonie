package media.orthophonie.dto;

public class Cnam {
	private long idcnam ;
	private int assurenum ;
	private int reference ;
	private String nombeneficiaire ;
    private String adresse ;
    private String nomassure ;
    private String prenomassure ;
    
	public Cnam() {
		super();
	}

	public Cnam(int assurenum, int reference, String nombeneficiaire,
			String adresse, String nomassure, String prenomassure) {
		super();
		this.assurenum = assurenum;
		this.reference = reference;
		this.nombeneficiaire = nombeneficiaire;
		this.adresse = adresse;
		this.nomassure = nomassure;
		this.prenomassure = prenomassure;
	}

	public long getIdcnam() {
		return idcnam;
	}

	public void setIdcnam(long idcnam) {
		this.idcnam = idcnam;
	}

	public int getAssurenum() {
		return assurenum;
	}

	public void setAssurenum(int assurenum) {
		this.assurenum = assurenum;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getNombeneficiaire() {
		return nombeneficiaire;
	}

	public void setNombeneficiaire(String nombeneficiaire) {
		this.nombeneficiaire = nombeneficiaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNomassure() {
		return nomassure;
	}

	public void setNomassure(String nomassure) {
		this.nomassure = nomassure;
	}

	public String getPrenomassure() {
		return prenomassure;
	}

	public void setPrenomassure(String prenomassure) {
		this.prenomassure = prenomassure;
	}
    
    
}
