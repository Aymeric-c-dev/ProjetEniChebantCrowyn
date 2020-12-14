package fr.eni.Connexion.dal;

public abstract class CodesResultatDAL {

	// echec général quand tentative d'ajouter un objet null
	public static final int INSERT_OBJET_NULL = 10000;

	// echec général quand erreur non gérée à l'insertion
	public static final int INSERT_OBJET_ECHEC = 10001;
}