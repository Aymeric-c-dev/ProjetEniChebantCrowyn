package fr.eni.Exception;

import java.util.ArrayList;
import java.util.List;



public class BusinessException extends Exception {
	
	private static final long serialVersinUID=1L;
	private List<Integer> listeCodeErreur;
	
	public BusinessException() {
		super();
		this.listeCodeErreur=new ArrayList<>();
	}
	
	public void ajouterErreur (int code)
	{
		if(!this.listeCodeErreur.contains(code)) {
			this.listeCodeErreur.add(code);
		}
	}
	
	public boolean hasErreurs() {
		return this.listeCodeErreur.size()>0;
	}
	
	public List<Integer> getListeCodeErreur(){
		return this.listeCodeErreur;
	}
}