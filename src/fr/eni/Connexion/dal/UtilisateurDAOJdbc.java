package fr.eni.Connexion.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import fr.eni.BO.CompteUtilisateur;
import fr.eni.Connexion.dal.*;
import fr.eni.Exception.BusinessException;

class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String SELECT = "SELECT no_utilisateur,pseudo,email  FROM UTILISATEURS WHERE (pseudo = ? OR email= ?) AND mot_de_passe=?";

	@Override
	public void select(CompteUtilisateur compteUtilisateur) throws BusinessException {

		if (compteUtilisateur == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
			throw businessException;
		}
		try (Connection cnx = ConnectionProvider.getConnection()) {
			String pseudo = compteUtilisateur.getPseudo();
			String email = compteUtilisateur.getEmail();
			String mdp = compteUtilisateur.getMotDePasse();

			PreparedStatement ptmt = cnx.prepareStatement(SELECT);
			ptmt.setString(1, pseudo);
			ptmt.setString(2, email);
			ptmt.setString(3, mdp);
			ptmt.executeQuery();
			ResultSet rs = ptmt.executeQuery();
			if (rs.next()) { // modifier en if  
				
				compteUtilisateur.setConnected(true);
								
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			throw businessException;
		}
	}
}