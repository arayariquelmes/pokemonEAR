package cl.inacap.pokemonsModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.pokemonsModel.dto.Pokemon;

@Local
public interface PokemonsDAOLocal {

	void add(Pokemon p);
	List<Pokemon> getAll();
	
}
