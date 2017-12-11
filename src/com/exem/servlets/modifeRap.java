package com.exem.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exem.Dao.DaoRapImpli;
import com.exem.beans.rapport;

/**
 * Servlet implementation class modifeRap
 */
@WebServlet("/modiferap")
public class modifeRap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifeRap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/modiferap.jsp").forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoRapImpli daoRapImpli =new DaoRapImpli();
		rapport rap = new rapport();
		rap.setId_rapport(8);
		rap.setNom_etudi(request.getParameter("nom"));
		rap.setPrenom_etudiant(request.getParameter("prnom"));
		rap.setTitre_rapport(request.getParameter("titre"));
		rap.setAnnee_rapport(request.getParameter("annee"));
		rap.setBranche_etudes(request.getParameter("branche"));
		rap.setMention_rapport(request.getParameter("montion"));
		rap.setDescription(request.getParameter("desc"));
		rap.setRapport(request.getParameter("file"));
			daoRapImpli.modifer(rap);
		


		
		

	}

}
