package cl.inacap.pokemonsWar.controllers;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.pokemonsModel.dao.PokemonsDAOLocal;
import cl.inacap.pokemonsModel.dao.TiposDAOLocal;
import cl.inacap.pokemonsModel.dto.Pokemon;
import cl.inacap.pokemonsModel.dto.Tipo;

/**
 * Servlet implementation class AgregarPokemonesController
 */
@WebServlet("/AgregarPokemonesController.do")
public class AgregarPokemonesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Inject
	private TiposDAOLocal tiposDAO;
	@Inject
	private PokemonsDAOLocal pokemonsDAO;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarPokemonesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Tipo> tipos = tiposDAO.getAll();
		request.setAttribute("tipos", tipos);
		request.getRequestDispatcher("WEB-INF/paginas/agregarPokemon.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("nombre-txt").trim();
		int nivel = Integer.parseInt(request
					.getParameter("nivel-txt").trim());
		String descripcion = request.getParameter("desc-txt").trim();
		
		Tipo tipo = tiposDAO.find(Integer
				.parseInt(request.getParameter("tipo-select")));
		
		Pokemon p = new Pokemon();
		p.setNombre(nombre);
		p.setNivel(nivel);
		p.setDescripcion(descripcion);
		p.setTipo(tipo);
		
		pokemonsDAO.add(p);
		response.sendRedirect("VerPokemonesController.do");
		
	}

}
