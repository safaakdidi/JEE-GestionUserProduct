package WebMvc;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

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
 * Servlet implementation class UpdateProdServlet
 */
public class UpdateProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateProdServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id=Integer.parseInt(request.getParameter("code"));
		String  n=request.getParameter("nom");
		String d=request.getParameter("description");
		int  q=Integer.parseInt( request.getParameter("quantite"));
		double p=Double.parseDouble(request.getParameter("prix")) ;
		
		GestionProduit gu=new GestionProduit();
		gu.update(id,n,d,q,p);
		
		List<Produit> v=gu.lister();
		
		request.setAttribute("prods",v);
		request.getSession().setAttribute("prods",v);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("CatalogueView.jsp") ;	
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
