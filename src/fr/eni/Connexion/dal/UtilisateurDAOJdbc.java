package fr.eni.Connexion.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import fr.eni.BO.CompteUtilisateur;
import fr.eni.Connexion.dal.*;
import fr.eni.Exception.BusinessException;

class UtilisateurDAOJdbcImpl implements UtilisateurDAO {
	private static final String SELECT = "SELECT no_utilisateur,pseudo,email  FROM UTILISATEURS WHERE (pseudo = ? OR email= ? AND mot_de_passe=?)";
	Statement stmt;
	@Override
	public void select(CompteUtilisateur compteUtilisateur) throws BusinessException {
		if (compteUtilisateur == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
			throw businessException;
		}
		try (Connection cnx = ConnectionProvider.getConnection()) {
			 stmt = cnx.createStatement();
			stmt.setString(1,compteUtilisateur.getPseudo());
			stmt.toString(2,compteuUtilisateur.getemail())
			stmt.executeQuery(SELECT);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next())
			{  ,fhgjhùpç dtsohjgntredh gùurei(pà*gnire(Mgh nàp))
			}

		}
	 catch (Exception e)
	{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			throw businessException;	
	}
}
}