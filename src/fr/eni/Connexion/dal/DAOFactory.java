package fr.eni.Connexion.dal;

public abstract class DAOFactory {
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}

	protected abstract UtilisateurDAO UtilisateurDAOJdbcImpl();
}