package fr.eni.Connexion.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.BO.CompteUtilisateur;
import fr.eni.Connexion.dal.*;

class UtilisateurDAOJdbcImpl implements UtilisateurDAO{
	 private static final String SELECT ="SELECT no_utilisateur,pseudo,email  FROM UTILISATEURS WHERE (pseudo = ? OR email= ? AND mot_de_passe=?)";

	@Override
	public void select(CompteUtilisateur compteUtilisateur) throws BusinessException {
		if (compteUtilisateur == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
			throw businessException;
		}
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT);
			pstmt.setString(1, CompteUtilisateur.getEmail());
			pstmt.setString(2, CompteUtilisateur.getMotDePasse());
			pstmt.executeUpdate();
			ResultSet rs = pstmt;
			if (rs.next()) {
				);
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
					}
			throw businessException;
		
	}
 }