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
public class EventoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Evento que se encuentran en la base de datos.
	 * @return lista de Evento
	 * @generated
	 */
	public List<Evento> obtenerTodos(){
		return em.createNamedQuery("Evento.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Evento dado su identificador. 	
	 * @param id identificador del elemento Evento
	 * @return Evento del id dado
	 * @generated
	 */
	public Evento obtener(Long id){
		return em.find(Evento.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Evento
	 * @param entidad Evento a guardar
	 * @return Evento con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Evento guardar(Evento entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Evento con el identificador dado.
	 * @param id identificador del Evento
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Evento.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Evento.
	 * @param entidad Evento a actualizar
	 * @generated
	 */
	public void actualizar(Evento entidad){
		em.merge(entidad);
	}
	
	
}
