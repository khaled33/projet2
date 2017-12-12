package com.exem.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exem.Dao.DaoRapImpli;
import com.exem.Dao.UserDao;
import com.exem.beans.User;
import com.exem.beans.rapport;

@WebServlet("/index")
public class index extends HttpServlet{
	private static final long serialVersionUID = 1L;

	 public index() {
	        super();
	      
	    }

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	response.sendRedirect( request.getContextPath()+"/WEBINF/connexion.jsp");
			 HttpSession session = request.getSession();
			 String n =(String) session.getAttribute("email");
			 
					 User user =new User();
					 UserDao userDao=new UserDao();
			 
			   user = userDao.recherUser(n);
			   //session.setAttribute("email", n);
			 
			   session.setAttribute("users", user);
			   List<rapport> list=new ArrayList<rapport>();
			   
			   DaoRapImpli b= new DaoRapImpli();
				list=b.list();
				request.setAttribute("list", list);
				//System.out.println(list.toString());
			 
			
			 this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward( request, response );

		}

		
		


		

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
		}


		

}

