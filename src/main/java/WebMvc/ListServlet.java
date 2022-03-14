package WebMvc;


import java.io.IOException;

import metier.GestionUtilisateur;
import jakarta.servlet.RequestDispatcher;
import  jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import metier.Utilisateur;

import java.util.Vector;
/**
 * Servlet implementation class LoginServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession maSession=req.getSession(false);
		if(maSession==null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp") ;	
			requestDispatcher.forward(req, resp);	
		}else {
		 Utilisateur user = (Utilisateur) maSession.getAttribute("user");
		 if(user==null) {
			 RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp") ;	
				requestDispatcher.forward(req, resp);	
		 }else {
			 
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("UsersList.jsp") ;	
		requestDispatcher.forward(req, resp);
		 }}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
