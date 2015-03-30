package media.orthophonie.dto;

import java.util.Date;

public class Comptabilite {

	private long idcomptabilite ;
	private Date  datecomptabilite ;
	private double montant ;
	private String libelle ;
	
	public Comptabilite() {
		super();
	}
	public Comptabilite(long idcomptabilite, Date datecomptabilite,
			double montant, String libelle) {
		super();
		
		this.datecomptabilite = datecomptabilite;
		this.montant = montant;
		this.libelle = libelle;
	}
	public long getIdcomptabilite() {
		return idcomptabilite;
	}
	public void setIdcomptabilite(long idcomptabilite) {
		this.idcomptabilite = idcomptabilite;
	}
	public Date getDatecomptabilite() {
		return datecomptabilite;
	}
	public void setDatecomptabilite(Date datecomptabilite) {
		this.datecomptabilite = datecomptabilite;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
}
