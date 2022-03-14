package WebMvc;

import java.io.IOException;

import metier.GestionUtilisateur;

import jakarta.servlet.RequestDispatcher;
import  jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import metier.Utilisateur;
import  jakarta.servlet.http.HttpServlet;
/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String  login=req.getParameter("login");
	String pass=req.getParameter("password");
	if((login==null )||(login=="")||(pass==null)||(pass=="")) {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp") ;	
		requestDispatcher.forward(req, resp);
	}else {
	
	GestionUtilisateur gu=new GestionUtilisateur();
	Utilisateur user= gu.Chercher(login, pass);
	if (user!=null) {
		HttpSession maSession = req.getSession(true);
		maSession.setAttribute("user", user);
		req.setAttribute("user", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Bienvenue.jsp") ;	
		requestDispatcher.forward(req, resp);
	}else {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp") ;	
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
