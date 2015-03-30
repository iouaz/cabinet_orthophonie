package media.orthophonie.dto;

public class Cabinet {
	private long idcabinet ;
	private  String nomcabinet ;
	private String adresse ;
	private int numtéléphone ;
	
	public Cabinet() {
		super();
	}

	public Cabinet(String nomcabinet, String adresse, int numtéléphone) {
		super();
		this.nomcabinet = nomcabinet;
		this.adresse = adresse;
		this.numtéléphone = numtéléphone;
	}

	public long getIdcabinet() {
		return idcabinet;
	}

	public void setIdcabinet(long idcabinet) {
		this.idcabinet = idcabinet;
	}

	public String getNomcabinet() {
		return nomcabinet;
	}

	public void setNomcabinet(String nomcabinet) {
		this.nomcabinet = nomcabinet;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumtéléphone() {
		return numtéléphone;
	}

	public void setNumtéléphone(int numtéléphone) {
		this.numtéléphone = numtéléphone;
	}
	
	
	
	

}
