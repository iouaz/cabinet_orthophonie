package media.orthophonie.dto;

import java.util.Date;

public class Facture {

	private long idfacture ;
	private Date datefacture ;
	private String nompatient ;
	private String prenompatient ;
	private String nomassure ;
	private String prenomassure ;
	private int numassure ;
	private int cinassure ;
	private String cnam ;
	private int numpriseencharge ;
	private Date dateeditions ;
	private String qualite ;
	private double prixHT ;
	private double TVA ;
	private double montantTTC ;
	private String montantenlettre ;
	
	public Facture() {
		super();
	}

	public Facture(Date datefacture, String nompatient, String prenompatient,
			String nomassure, String prenomassure, int numassure,
			int cinassure, String cnam, int numpriseencharge,
			Date dateeditions, String qualite, double prixHT, double tVA,
			double montantTTC, String montantenlettre) {
		super();
		this.datefacture = datefacture;
		this.nompatient = nompatient;
		this.prenompatient = prenompatient;
		this.nomassure = nomassure;
		this.prenomassure = prenomassure;
		this.numassure = numassure;
		this.cinassure = cinassure;
		this.cnam = cnam;
		this.numpriseencharge = numpriseencharge;
		this.dateeditions = dateeditions;
		this.qualite = qualite;
		this.prixHT = prixHT;
		TVA = tVA;
		this.montantTTC = montantTTC;
		this.montantenlettre = montantenlettre;
	}

	public long getIdfacture() {
		return idfacture;
	}

	public void setIdfacture(long idfacture) {
		this.idfacture = idfacture;
	}

	public Date getDatefacture() {
		return datefacture;
	}

	public void setDatefacture(Date datefacture) {
		this.datefacture = datefacture;
	}

	public String getNompatient() {
		return nompatient;
	}

	public void setNompatient(String nompatient) {
		this.nompatient = nompatient;
	}

	public String getPrenompatient() {
		return prenompatient;
	}

	public void setPrenompatient(String prenompatient) {
		this.prenompatient = prenompatient;
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

	public int getNumassure() {
		return numassure;
	}

	public void setNumassure(int numassure) {
		this.numassure = numassure;
	}

	public int getCinassure() {
		return cinassure;
	}

	public void setCinassure(int cinassure) {
		this.cinassure = cinassure;
	}

	public String getCnam() {
		return cnam;
	}

	public void setCnam(String cnam) {
		this.cnam = cnam;
	}

	public int getNumpriseencharge() {
		return numpriseencharge;
	}

	public void setNumpriseencharge(int numpriseencharge) {
		this.numpriseencharge = numpriseencharge;
	}

	public Date getDateeditions() {
		return dateeditions;
	}

	public void setDateeditions(Date dateeditions) {
		this.dateeditions = dateeditions;
	}

	public String getQualite() {
		return qualite;
	}

	public void setQualite(String qualite) {
		this.qualite = qualite;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public double getTVA() {
		return TVA;
	}

	public void setTVA(double tVA) {
		TVA = tVA;
	}

	public double getMontantTTC() {
		return montantTTC;
	}

	public void setMontantTTC(double montantTTC) {
		this.montantTTC = montantTTC;
	}

	public String getMontantenlettre() {
		return montantenlettre;
	}

	public void setMontantenlettre(String montantenlettre) {
		this.montantenlettre = montantenlettre;
	}
	
	
	
}
