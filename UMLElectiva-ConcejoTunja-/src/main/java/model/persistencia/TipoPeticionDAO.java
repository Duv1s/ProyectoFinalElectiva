package model.persistencia;

import model.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 *  @generated
 *  @author Duv1s
 */
@Stateless
public class TipoPeticionDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los TipoPeticion que se encuentran en la base de datos.
	 * @return lista de TipoPeticion
	 * @generated
	 */
	public List<TipoPeticion> obtenerTodos(){
		return em.createNamedQuery("TipoPeticion.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene TipoPeticion dado su identificador. 	
	 * @param id identificador del elemento TipoPeticion
	 * @return TipoPeticion del id dado
	 * @generated
	 */
	public TipoPeticion obtener(Long id){
		return em.find(TipoPeticion.class, id);
	}
	
	
	/**
	 * Almacena la informacion de TipoPeticion
	 * @param entidad TipoPeticion a guardar
	 * @return TipoPeticion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoPeticion guardar(TipoPeticion entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro TipoPeticion con el identificador dado.
	 * @param id identificador del TipoPeticion
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(TipoPeticion.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de TipoPeticion.
	 * @param entidad TipoPeticion a actualizar
	 * @generated
	 */
	public void actualizar(TipoPeticion entidad){
		em.merge(entidad);
	}
	
	
}
