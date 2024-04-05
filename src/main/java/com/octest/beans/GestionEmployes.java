package com.octest.beans;

import java.util.ArrayList;

public class GestionEmployes {
	public ArrayList<Employe> listeEmployes = new ArrayList<>();

	
	
	   public GestionEmployes() {
	}

	public boolean addEmploye(String nom,String email,int telephone,String departement,String poste) {
		   Employe employe = new Employe(nom,email,telephone,departement,poste);
		   listeEmployes.add(employe);
		   return true;
	   }
	   
	   public boolean deleteEmploye(String nom){
		   for (Employe employe : listeEmployes) {
	           if (employe.getNom() == nom){
	               listeEmployes.remove(employe);
	               return true;
	           }
	       }
		   return false;
	   }
	   
	   public boolean updateEmploye(String nom,String email,int telephone,String departement,String poste){
		   for (Employe employe : listeEmployes) {
	           if (employe.getNom() == nom){
	               employe.setNom(nom);
	               employe.setEmail(email);
	               employe.setTelephone(telephone);;
	               employe.setDepartement(departement);
	               employe.setPoste(poste);
	               return true;
	           }
	       }
		   return false;
	   }
}
