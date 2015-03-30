package media.orthophonie.metier;

import java.util.List;

import media.orthophonie.dto.Utilisateur;

public interface IUtilisateurMetier {

	public void insertUtilisateur (Utilisateur user);
	public void updateUtilisateur (Utilisateur user);
	public void deleteUtilisateur (int idUtilisateur);
	public List<Utilisateur> listUtilisateur ();
	public Utilisateur getUtilisateurById (int idUtilisateur);
	public List<Utilisateur> listUtilisateurByMC (String mc);
	public Utilisateur getUtilisateurByLoginPassword (String login, String password);
}
