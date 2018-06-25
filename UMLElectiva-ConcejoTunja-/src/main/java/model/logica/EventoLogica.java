package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
  *  @generated
  *  @author Duv1s
  */
@Stateless
public class EventoLogica {
	
	@EJB
    private EventoDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* Retorna una lista con los Evento que se encuentran en la base de datos
	* @return retorna una lista de EventoDTO
	* @generated
	*/
	public List<EventoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Evento dado su identificador. 	
	* @param id identificador del elemento Evento
	* @return Evento del id dado
	* @generated
	*/
	public EventoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Evento
	 * @param dto Evento a guardar
	 * @return Evento con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public EventoDTO guardar(EventoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Evento con el identificador dado
	 * @param id identificador del Evento
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Evento
	 * @param dto Evento a guardar
	 * @generated
	 */
	public void actualizar(EventoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un EventoDTO en la entidad Evento.  
	* @param dto a convertir
	* @return entidad Evento
	* @generated
	*/
	public Evento convertirDTO(EventoDTO dto){
		if(dto==null)return null;
		Evento entidad=new Evento();
		entidad.setId(dto.getId());
			entidad.setId(dto.getId());
			if(dto.getFecha()!=null){
				try {
					entidad.setFecha(fecha.parse(dto.getFecha()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha Fecha " + dto.getFecha());
		        }
			}
			entidad.setDescripcion(dto.getDescripcion());
			entidad.setUbicacion(dto.getUbicacion());
			entidad.setCosto(dto.getCosto());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  EventoDTO en una lista de Evento.  
	* @param dtos a convertir
	* @return entidades List<Evento>
	* @generated
	*/
	public List<Evento> convertirDTO(List<EventoDTO> dtos){
		List<Evento> entidades=new ArrayList<Evento>();
		for(EventoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Evento en un DTO EventoDTO.  
	* @param entidad a convertir
	* @return dto EventoDTO
	* @generated
	*/
	public EventoDTO convertirEntidad(Evento entidad){
		EventoDTO dto=new EventoDTO();
		dto.setId(entidad.getId());
				dto.setId(entidad.getId());
				if(entidad.getFecha()!=null){
					dto.setFecha(fecha.format(entidad.getFecha()));
				}
				dto.setDescripcion(entidad.getDescripcion());
				dto.setUbicacion(entidad.getUbicacion());
				dto.setCosto(entidad.getCosto());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Evento en una lista de EventoDTO.  
	* @param entidades a convertir
	* @return dtos List<EventoDTO>
	* @generated
	*/
	public List<EventoDTO> convertirEntidad(List<Evento> entidades){
		List<EventoDTO> dtos=new ArrayList<EventoDTO>();
		for(Evento entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
