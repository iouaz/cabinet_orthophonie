package media.orthophonie.dto;

public class Cabinet {
	private long idcabinet ;
	private  String nomcabinet ;
	private String adresse ;
	private int numt�l�phone ;
	
	public Cabinet() {
		super();
	}

	public Cabinet(String nomcabinet, String adresse, int numt�l�phone) {
		super();
		this.nomcabinet = nomcabinet;
		this.adresse = adresse;
		this.numt�l�phone = numt�l�phone;
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

	public int getNumt�l�phone() {
		return numt�l�phone;
	}

	public void setNumt�l�phone(int numt�l�phone) {
		this.numt�l�phone = numt�l�phone;
	}
	
	
	
	

}
