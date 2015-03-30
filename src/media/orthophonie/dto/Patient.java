package media.orthophonie.dto;

import java.util.Date;

public class Patient {

	private Long idPatient;
	private String nomPatient;
	private String prenomPatient;
	private String sexePatient;
	private Date dateNaissance;
	private int age;
	
	private Mere mere;
	private Pere pere;
	
	public Patient() {
		super();
	}

	public Patient(String nomPatient, String prenomPatient, String sexePatient,
			Date dateNaissance, int age) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.sexePatient = sexePatient;
		this.dateNaissance = dateNaissance;
		this.age = age;
	}

	public Long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(Long idPatient) {
		this.idPatient = idPatient;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getPrenomPatient() {
		return prenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}

	public String getSexePatient() {
		return sexePatient;
	}

	public void setSexePatient(String sexePatient) {
		this.sexePatient = sexePatient;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Mere getMere() {
		return mere;
	}

	public void setMere(Mere mere) {
		this.mere = mere;
	}

	public Pere getPere() {
		return pere;
	}

	public void setPere(Pere pere) {
		this.pere = pere;
	}

	
}
