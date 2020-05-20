package cl.inacap.pokemonsModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.pokemonsModel.dto.Pokemon;

/**
 * Session Bean implementation class PokemonsDAO
 */
@Stateless
@LocalBean
public class PokemonsDAO implements PokemonsDAOLocal {

	private static List<Pokemon> pokemones = new ArrayList<Pokemon>();
	private static AtomicInteger numerador = new AtomicInteger(1);
    /**
     * Default constructor. 
     */
    public PokemonsDAO() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void add(Pokemon p) {
		p.setNumero(numerador.getAndIncrement());
		pokemones.add(p);
	}
	@Override
	public List<Pokemon> getAll() {
		// TODO Auto-generated method stub
		return pokemones;
	}



}
