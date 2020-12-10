package fr.eni.BO;

public class CompteUtilisateur {
	/*
	 * version 1 08/12/2020
	 */
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private int rue;
	private int codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private int administrateur;
	private int numeroUtilisateur;

	// le constructeur pour créer instance Utilisateur

	public CompteUtilisateur() {
		// TODO Auto-generated constructor stub
	}

	public CompteUtilisateur(String pseudo, String nom, String prenom, String email, String telephone, int rue,
			int codePostal, String ville, String motDePasse, int credit, int administrateur, int numeroUtilisateur) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		this.numeroUtilisateur = numeroUtilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getRue() {
		return rue;
	}

	public void setRue(int rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(int administrateur) {
		this.administrateur = administrateur;
	}

	public int getNumeroUtilisateur() {
		return numeroUtilisateur;
	}

	public void setNumeroUtilisateur(int numeroUtilisateur) {
		this.numeroUtilisateur = numeroUtilisateur;
	}

	@Override
	public String toString() {
		return "CompteUtilisateur [pseudo=" + pseudo + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", telephone=" + telephone + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville
				+ ", motDePasse=" + motDePasse + ", credit=" + credit + ", administrateur=" + administrateur
				+ ", numeroUtilisateur=" + numeroUtilisateur + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pseudo == null) ? 0 : pseudo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteUtilisateur other = (CompteUtilisateur) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pseudo == null) {
			if (other.pseudo != null)
				return false;
		} else if (!pseudo.equals(other.pseudo))
			return false;
		return true;
	}
	
}
