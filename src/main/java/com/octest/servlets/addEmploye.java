package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.GestionEmployes;


@WebServlet("/addEmploye")
public class addEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/addEmploye.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String email = request.getParameter("email");
		int telephone = Integer.parseInt(request.getParameter("telephone"));
		String departement = request.getParameter("departement");
		String poste = request.getParameter("poste");
		
		GestionEmployes gestionEM = new GestionEmployes();
		boolean add = gestionEM.addEmploye(nom, email, telephone, departement, poste);
		
		request.setAttribute("Resultat", add);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/addEmploye.jsp").forward(request, response);
	}

}
