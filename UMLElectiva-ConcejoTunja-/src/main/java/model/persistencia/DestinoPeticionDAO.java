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
public class DestinoPeticionDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los DestinoPeticion que se encuentran en la base de datos.
	 * @return lista de DestinoPeticion
	 * @generated
	 */
	public List<DestinoPeticion> obtenerTodos(){
		return em.createNamedQuery("DestinoPeticion.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene DestinoPeticion dado su identificador. 	
	 * @param id identificador del elemento DestinoPeticion
	 * @return DestinoPeticion del id dado
	 * @generated
	 */
	public DestinoPeticion obtener(Long id){
		return em.find(DestinoPeticion.class, id);
	}
	
	
	/**
	 * Almacena la informacion de DestinoPeticion
	 * @param entidad DestinoPeticion a guardar
	 * @return DestinoPeticion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public DestinoPeticion guardar(DestinoPeticion entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro DestinoPeticion con el identificador dado.
	 * @param id identificador del DestinoPeticion
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(DestinoPeticion.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de DestinoPeticion.
	 * @param entidad DestinoPeticion a actualizar
	 * @generated
	 */
	public void actualizar(DestinoPeticion entidad){
		em.merge(entidad);
	}
	
	
}
