package fr.eni.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.BLL.ConnexionManager;
import fr.eni.BO.CompteUtilisateur;

/**
 * Servlet implementation class SeConnecter
 */

public class SeConnecter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= request.getRequestDispatcher("/Pages/Connexion/Connexion.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
		String email = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		ConnexionManager connexionManager = new ConnexionManager();
		CompteUtilisateur CompteUtilisateur = connexionManager.ajouter(email, mdp);
		request.setAttribute("connexion", CompteUtilisateur);
		}
		catch(NumberFormatException e) {
			List<Integer>listeCodesErreur=newArrayList<>();
			listeCodesErreur.add(CodesResulatServlets.FORMAT_AVIS_NOTE_ERREUR);
			request.setAttribute("listeCoeesErrerur", listeCodesErreur);
		}catch (BusinessException e) {
			request.setAttribute("listeCodesErreur",e.getListeCodesErreur());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/Pages/Connexion/Connexion.html");
		rd.forward(request,response);
	}

}
