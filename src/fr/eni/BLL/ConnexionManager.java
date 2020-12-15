package fr.eni.BLL;

import fr.eni.BO.CompteUtilisateur;
import fr.eni.Connexion.dal.DAOFactory;
import fr.eni.Exception.BusinessException;




public class ConnexionManager {
	private fr.eni.Connexion.dal.UtilisateurDAO UtilisateurDAO;
	
	public ConnexionManager() {
		this.UtilisateurDAO= DAOFactory.getUtilisateurDAO();
	}
	
	public CompteUtilisateur ajouter ( String email, String MoTdePasse) throws BusinessException {
		
		BusinessException exception = new BusinessException();
		CompteUtilisateur utilisateur = new CompteUtilisateur(email,MoTdePasse);
		
		this.valideremail(UtilisateurDAO,exception);
		this.validerMoTdePasse(UtilisateurDAO,exception);
		
		if(!exception.hasErreurs()) {
			this.UtilisateurDAO.select(utilisateur);
		}
		if(exception.hasErreurs()) {
			throw exception;
		}
		return utilisateur;
	}

	private void validerMoTdePasse(fr.eni.Connexion.dal.UtilisateurDAO utilisateurDAO2, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}

	private void valideremail(fr.eni.Connexion.dal.UtilisateurDAO utilisateurDAO2, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
}