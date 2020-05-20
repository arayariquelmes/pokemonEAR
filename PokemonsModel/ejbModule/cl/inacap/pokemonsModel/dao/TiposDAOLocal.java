package cl.inacap.pokemonsModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.pokemonsModel.dto.Tipo;

@Local
public interface TiposDAOLocal {

	List<Tipo> getAll();
	Tipo find(int codigo);
}
