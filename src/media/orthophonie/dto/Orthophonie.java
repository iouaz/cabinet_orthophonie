package media.orthophonie.dto;

public class Orthophonie extends Utilisateur {
	
	private int codecnam;
	private double TVA;
	private int RIB;
	private String banque;
	private int matriculefiscalite;
	
	public Orthophonie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orthophonie(String nomUser, String prenomUser, int telUser,
			String login, String password) {
		super(nomUser, prenomUser, telUser, login, password);
		// TODO Auto-generated constructor stub
	}
	
	public Orthophonie(int codecnam, double tVA, int rIB, String banque,
			int matriculefiscalite) {
		super();
		this.codecnam = codecnam;
		TVA = tVA;
		RIB = rIB;
		this.banque = banque;
		this.matriculefiscalite = matriculefiscalite;
	}
	public int getCodecnam() {
		return codecnam;
	}
	public void setCodecnam(int codecnam) {
		this.codecnam = codecnam;
	}
	public double getTVA() {
		return TVA;
	}
	public void setTVA(double tVA) {
		TVA = tVA;
	}
	public int getRIB() {
		return RIB;
	}
	public void setRIB(int rIB) {
		RIB = rIB;
	}
	public String getBanque() {
		return banque;
	}
	public void setBanque(String banque) {
		this.banque = banque;
	}
	public int getMatriculefiscalite() {
		return matriculefiscalite;
	}
	public void setMatriculefiscalite(int matriculefiscalite) {
		this.matriculefiscalite = matriculefiscalite;
	}
	

	
	
}
