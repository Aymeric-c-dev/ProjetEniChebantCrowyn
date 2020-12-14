
<%@ page import="fr.eni.BO.CompteUtilisateur"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% CompteUtilisateur compteUtilisateur= (CompteUtilisateur)request.getAttribute("compteUtilisateur");
	if(compteUtilisateur!=null){
		
	%>
	<p style="color: red;">Vous êtes un membre</p>
	<p><%=compteUtilisateur %></p>

	<% 
	}
	%>

	<% 
		List<Integer> listeCodesErreur = (list<Integer>)request.getAttribute("listeCodesErreur");
		if (listeCodesErreur !=null)
		{
	%>
	<p style="">Erreur, impossible de se connecté:</p>
	<%
			for (int codeErreur:listeCodesErreur){
	%>
	<p>
		<% LecteurMessage.getMessageErreur (codeErreur);%>
	</p>
	<%
			}
		}
	%>


	<form action ="<%request.getContextPath();%>/ProjetENIChebantCrowyn/SeConnecter" method="post" >

		<input type="text" id="login" name="login" placeholder="login">
		<input type="password" id="Mdp" name="mdp" placeholder="mot de passe">
		<input type="submit" value="login" />
	</form>
</body>
</html>