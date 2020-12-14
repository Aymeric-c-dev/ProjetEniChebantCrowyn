package fr.eni.BLL

import fr.eni.BO.CompteUtilisateur;
import fr.eni.Connexion.dal.DAOFactory;




public class ConnexionManager {
	private fr.eni.Connexion.dal.UtilisateurDAO UtilisateurDAO;
	
	public ConnexionManager() {
		this.UtilisateurDAO= DAOFactory.getUtilisateurDAO();
	}
	
	public CompteUtilisateur ajouter ( String email, String MoTdePasse) throws BusinessException {
		CompteUtilisateur utilisateur = new CompteUtilisateur(email,MoTdePasse);
		
		this.valideremail(UtilisateurDAO,exception);
		this.validerMoTdePasse(UtilisateurDAO,exception);
		
		if(!exception.hasErreurs()) {
			this.UtilisateurDAO.select(UtilisateurDAO);
		}
		if(exception.hasErreurs()) {
			throw exception;
		}
		return utilisateur;
	}
}