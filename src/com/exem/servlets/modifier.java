package com.exem.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exem.Dao.UserDao;
import com.exem.beans.User;



@WebServlet("/modifier")
public class modifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			//users = (Utilisateur)session.getAttribute("users");
			//request.setAttribute("msg", users);
			String email =(String) session.getAttribute("email");
			request.setAttribute("email", email);

			this.getServletContext().getRequestDispatcher("/WEB-INF/modifier.jsp").forward(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			UserDao b=new UserDao();
			
			  String nom=request.getParameter("nom");
			  String prenom=request.getParameter("prenom");
			  String pass=request.getParameter("n_pass");
			  String email=request.getParameter("email");
			//  String email =(String) session.getAttribute("email");
				//request.setAttribute("email", email);
				System.out.println(email);
				System.out.println(nom);
				 b.modifier(nom,prenom,pass,email);
				 this.getServletContext().getRequestDispatcher("/WEB-INF/modifier.jsp").forward(request, response);
			 
			
		}
	
}