package media.orthophonie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import media.orthophonie.dto.Utilisateur;

public class UtilisateurDAOImpl implements IUtulisateurDAO {

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
	public Utilisateur getUtilisateurByLoginPassword(String login,String password) {
		Utilisateur utilisateur = null;
		Connection con =  ConnexionDB.getConnexionDB();
		String sql = "SELECT * FROM `utilisateur` WHERE login=? and password=?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, login);
			pst.setString(2, password);
			ResultSet result = pst.executeQuery();
			while (result.next()){
				utilisateur = new Utilisateur();
				utilisateur.setIdUtilisateur(result.getLong("ID_UTILISATEUR"));
				utilisateur.setNomUser(result.getString("NOM_UTILISATEUR"));
				utilisateur.setPrenomUser(result.getString("PRENOM_UTILISATEUR"));
				utilisateur.setTelUser(result.getInt("TEL"));
				utilisateur.setLogin(result.getString("LOGIN"));
				utilisateur.setPassword(result.getString("PASSWORD"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}

}
