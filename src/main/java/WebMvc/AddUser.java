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
 * Servlet implementation class UpdateUser
 */
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession maSession=request.getSession(false);
		if(maSession==null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp") ;	
			requestDispatcher.forward(request, response);	
		}else {
		 Utilisateur user = (Utilisateur) maSession.getAttribute("user");
		 if(user==null) {
			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp") ;	
				requestDispatcher.forward(request, response);	
		 }else {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddForm.jsp") ;	
		requestDispatcher.forward(request, response);
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
