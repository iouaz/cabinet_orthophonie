package media.orthophonie.dto ;

import java.util.Date;

public class Seance {

	private int idseance ;
	private Date dateseance ;
	private int heureseance ;
	private String note ;
	private boolean payes ;
	private boolean presence ;
	private boolean priseencharge ;
	
	public Seance() {
		super();
	}

	public Seance(Date dateseance, int heureseance, String note,
			boolean payes, boolean presence, boolean priseencharge) {
		super();
		this.dateseance = dateseance;
		this.heureseance = heureseance;
		this.note = note;
		this.payes = payes;
		this.presence = presence;
		this.priseencharge = priseencharge;
	}

	public int getIdseance() {
		return idseance;
	}

	public void setIdseance(int idseance) {
		this.idseance = idseance;
	}

	public Date getDateseance() {
		return dateseance;
	}

	public void setDateseance(Date dateseance) {
		this.dateseance = dateseance;
	}

	public int getHeureseance() {
		return heureseance;
	}

	public void setHeureseance(int heureseance) {
		this.heureseance = heureseance;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isPayes() {
		return payes;
	}

	public void setPayes(boolean payes) {
		this.payes = payes;
	}

	public boolean isPresence() {
		return presence;
	}

	public void setPresence(boolean presence) {
		this.presence = presence;
	}

	public boolean isPriseencharge() {
		return priseencharge;
	}

	public void setPriseencharge(boolean priseencharge) {
		this.priseencharge = priseencharge;
	}
	
	
	
}
