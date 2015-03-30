package media.orthophonie.dto;

public class Secretaire extends Utilisateur {

	private double salaire ;

	public Secretaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretaire(String nomUser, String prenomUser, int telUser,
			String login, String password) {
		super(nomUser, prenomUser, telUser, login, password);
		// TODO Auto-generated constructor stub
	}

	public Secretaire(double salaire) {
		super();
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
}
