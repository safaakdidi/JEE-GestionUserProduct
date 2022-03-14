package WebMvc;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import  jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import metier.GestionProduit;
import metier.Produit;
import metier.Utilisateur;
import  jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class ListProduitServlet
 */
public class ListProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     */
    public ListProduitServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		GestionProduit gestionProduit = new GestionProduit();
		
		List<Produit> prods = gestionProduit.lister();
		request.setAttribute("prods", prods);
		request.getSession().setAttribute("prods", prods);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("CatalogueView.jsp") ;	
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String motcle=request.getParameter("motCle");
		GestionProduit gestionProduit = new GestionProduit();
		
		List<Produit> prods = gestionProduit.listerProduitsParMotCle(motcle);
		if (prods.size()==0) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("NotFound.jsp") ;	
			requestDispatcher.forward(request, response);	
		}else {
		request.setAttribute("prods", prods);
		request.getSession().setAttribute("prods", prods);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("CatalogueView.jsp") ;	
		requestDispatcher.forward(request, response);
	}}

}
