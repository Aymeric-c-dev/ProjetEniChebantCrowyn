package fr.eni.CompteUtilisateur.bo;

public class CompteUtilisateur {

		private String pseudo;
		private String nom;
		private String prenom;
		private String email;
		private int telephone;
		private int rue;
		private int codePostal;
		private String ville;
		private String motDePasse;
		private int credit;
		private int administrateur;
		private int numeroUtilisateur;
		
	
		public Utilisateur(String pseudo,String nom,String prenom,String email,int telephone,int rue,int codePostal,String ville,String motDePasse,int credit,int numeroUtilisateur) {
			this.pseudo=pseudo;
			this.nom=nom;
			this.prenom=prenom;
			this.email=email;
			this.telephone=telephone;
			this.rue=rue;
			this.codePostal=codePostal;
			this.ville=ville;
			this.motDePasse=motDePasse;
			this.credit=credit;
			this.numeroUtilisateur=numeroUtilisateur;
		}
		
		
		public getPseudo() {
			return this.pseudo;
		}
		public void setPseudo(String pseudo) {
			this.pseudo=pseudo;
		}
		}
}
