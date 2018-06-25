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
public class PeticionDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Peticion que se encuentran en la base de datos.
	 * @return lista de Peticion
	 * @generated
	 */
	public List<Peticion> obtenerTodos(){
		return em.createNamedQuery("Peticion.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Peticion dado su identificador. 	
	 * @param id identificador del elemento Peticion
	 * @return Peticion del id dado
	 * @generated
	 */
	public Peticion obtener(Long id){
		return em.find(Peticion.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Peticion
	 * @param entidad Peticion a guardar
	 * @return Peticion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Peticion guardar(Peticion entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Peticion con el identificador dado.
	 * @param id identificador del Peticion
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Peticion.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Peticion.
	 * @param entidad Peticion a actualizar
	 * @generated
	 */
	public void actualizar(Peticion entidad){
		em.merge(entidad);
	}
	
	
}
