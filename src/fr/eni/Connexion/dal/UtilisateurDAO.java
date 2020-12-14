package fr.eni.Connexion.dal;


import fr.eni.BO.CompteUtilisateur;

// interface aux actions que l'on souhaite mener sur notre objet métier

public interface UtilisateurDAO {

	public void select(CompteUtilisateur compteutilisateur) throws BusinessException;
	
	
}