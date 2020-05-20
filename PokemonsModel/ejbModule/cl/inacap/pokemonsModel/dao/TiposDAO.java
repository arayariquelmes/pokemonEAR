package cl.inacap.pokemonsModel.dao;

import java.util.Arrays;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import cl.inacap.pokemonsModel.dto.Tipo;

/**
 * Session Bean implementation class TiposDAO
 */
@Singleton
@LocalBean
public class TiposDAO implements TiposDAOLocal {

	private List<Tipo> tipos;
    /**
     * Default constructor. 
     */
    public TiposDAO() {
    	//TODO: Definir iconos y colores
        tipos = Arrays.asList(new Tipo(1, "Agua", "fas fa-tint", "has-text-primary")
        		, new Tipo(2, "Fuego", "fas fa-fire", "has-text-danger")
        		, new Tipo(3, "Electrico", "fas fa-bolt", "has-text-warning")
        		, new Tipo(4, "Planta", "fas fa-seedling","has-text-success"));
    }

	@Override
	public List<Tipo> getAll() {
		
		return tipos;
	}

	@Override
	public Tipo find(int codigo) {
		
		return tipos.stream().filter(t->t.getCodigo() == codigo).findFirst().orElse(null);
	}

}
