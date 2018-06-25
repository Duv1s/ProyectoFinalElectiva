package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author Duv1s
  */
@Stateless
public class DestinoPeticionLogica {
	
	@EJB
    private DestinoPeticionDAO persistencia;


	
	/**
	* Retorna una lista con los DestinoPeticion que se encuentran en la base de datos
	* @return retorna una lista de DestinoPeticionDTO
	* @generated
	*/
	public List<DestinoPeticionDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene DestinoPeticion dado su identificador. 	
	* @param id identificador del elemento DestinoPeticion
	* @return DestinoPeticion del id dado
	* @generated
	*/
	public DestinoPeticionDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de DestinoPeticion
	 * @param dto DestinoPeticion a guardar
	 * @return DestinoPeticion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public DestinoPeticionDTO guardar(DestinoPeticionDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro DestinoPeticion con el identificador dado
	 * @param id identificador del DestinoPeticion
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de DestinoPeticion
	 * @param dto DestinoPeticion a guardar
	 * @generated
	 */
	public void actualizar(DestinoPeticionDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un DestinoPeticionDTO en la entidad DestinoPeticion.  
	* @param dto a convertir
	* @return entidad DestinoPeticion
	* @generated
	*/
	public DestinoPeticion convertirDTO(DestinoPeticionDTO dto){
		if(dto==null)return null;
		DestinoPeticion entidad=new DestinoPeticion();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  DestinoPeticionDTO en una lista de DestinoPeticion.  
	* @param dtos a convertir
	* @return entidades List<DestinoPeticion>
	* @generated
	*/
	public List<DestinoPeticion> convertirDTO(List<DestinoPeticionDTO> dtos){
		List<DestinoPeticion> entidades=new ArrayList<DestinoPeticion>();
		for(DestinoPeticionDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte DestinoPeticion en un DTO DestinoPeticionDTO.  
	* @param entidad a convertir
	* @return dto DestinoPeticionDTO
	* @generated
	*/
	public DestinoPeticionDTO convertirEntidad(DestinoPeticion entidad){
		DestinoPeticionDTO dto=new DestinoPeticionDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de DestinoPeticion en una lista de DestinoPeticionDTO.  
	* @param entidades a convertir
	* @return dtos List<DestinoPeticionDTO>
	* @generated
	*/
	public List<DestinoPeticionDTO> convertirEntidad(List<DestinoPeticion> entidades){
		List<DestinoPeticionDTO> dtos=new ArrayList<DestinoPeticionDTO>();
		for(DestinoPeticion entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
