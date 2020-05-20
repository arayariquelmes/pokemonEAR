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
import cl.inacap.pokemonsModel.dto.Pokemon;

/**
 * Servlet implementation class VerPokemonesController
 */
@WebServlet("/VerPokemonesController.do")
public class VerPokemonesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private PokemonsDAOLocal pokeDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerPokemonesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Pokemon> pokemones = pokeDAO.getAll();
		request.setAttribute("pokemones", pokemones);
		request.getRequestDispatcher("WEB-INF/paginas/verPokemones.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
