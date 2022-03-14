package WebMvc;

import java.io.IOException;

import metier.GestionProduit;
import metier.GestionUtilisateur;
import metier.Produit;
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
 * Servlet implementation class UpdateProd
 */
public class UpdateProd extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateProd() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("code"));
		GestionProduit gu=new GestionProduit();
		Produit u=gu.ChercherId(code);
		
		request.setAttribute("prod", u);
		request.getSession().setAttribute("prod", u);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("UpdateProdForm.jsp") ;	
		requestDispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
