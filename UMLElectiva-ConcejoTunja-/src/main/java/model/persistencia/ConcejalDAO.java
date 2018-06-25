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
public class ConcejalDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Concejal que se encuentran en la base de datos.
	 * @return lista de Concejal
	 * @generated
	 */
	public List<Concejal> obtenerTodos(){
		return em.createNamedQuery("Concejal.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Concejal dado su identificador. 	
	 * @param id identificador del elemento Concejal
	 * @return Concejal del id dado
	 * @generated
	 */
	public Concejal obtener(Long id){
		return em.find(Concejal.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Concejal
	 * @param entidad Concejal a guardar
	 * @return Concejal con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Concejal guardar(Concejal entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Concejal con el identificador dado.
	 * @param id identificador del Concejal
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Concejal.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Concejal.
	 * @param entidad Concejal a actualizar
	 * @generated
	 */
	public void actualizar(Concejal entidad){
		em.merge(entidad);
	}
	
	
}
