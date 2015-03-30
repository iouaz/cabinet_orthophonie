package media.orthophonie.metier;

import java.util.List;

import media.orthophonie.dao.IUtulisateurDAO;
import media.orthophonie.dao.UtilisateurDAOImpl;
import media.orthophonie.dto.Utilisateur;

public class UtilisateurMetierImpl implements IUtilisateurMetier {

	private IUtulisateurDAO userDAO = new UtilisateurDAOImpl();
			
	@Override
	public void insertUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUtilisateur(int idUtilisateur) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getUtilisateurById(int idUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> listUtilisateurByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getUtilisateurByLoginPassword(String login,
			String password) {
		return userDAO.getUtilisateurByLoginPassword(login, password);
	}

}
