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
public class TipoPeticionLogica {
	
	@EJB
    private TipoPeticionDAO persistencia;


	
	/**
	* Retorna una lista con los TipoPeticion que se encuentran en la base de datos
	* @return retorna una lista de TipoPeticionDTO
	* @generated
	*/
	public List<TipoPeticionDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene TipoPeticion dado su identificador. 	
	* @param id identificador del elemento TipoPeticion
	* @return TipoPeticion del id dado
	* @generated
	*/
	public TipoPeticionDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de TipoPeticion
	 * @param dto TipoPeticion a guardar
	 * @return TipoPeticion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoPeticionDTO guardar(TipoPeticionDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro TipoPeticion con el identificador dado
	 * @param id identificador del TipoPeticion
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de TipoPeticion
	 * @param dto TipoPeticion a guardar
	 * @generated
	 */
	public void actualizar(TipoPeticionDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un TipoPeticionDTO en la entidad TipoPeticion.  
	* @param dto a convertir
	* @return entidad TipoPeticion
	* @generated
	*/
	public TipoPeticion convertirDTO(TipoPeticionDTO dto){
		if(dto==null)return null;
		TipoPeticion entidad=new TipoPeticion();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setDescripcion(dto.getDescripcion());
		
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  TipoPeticionDTO en una lista de TipoPeticion.  
	* @param dtos a convertir
	* @return entidades List<TipoPeticion>
	* @generated
	*/
	public List<TipoPeticion> convertirDTO(List<TipoPeticionDTO> dtos){
		List<TipoPeticion> entidades=new ArrayList<TipoPeticion>();
		for(TipoPeticionDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte TipoPeticion en un DTO TipoPeticionDTO.  
	* @param entidad a convertir
	* @return dto TipoPeticionDTO
	* @generated
	*/
	public TipoPeticionDTO convertirEntidad(TipoPeticion entidad){
		TipoPeticionDTO dto=new TipoPeticionDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
				dto.setDescripcion(entidad.getDescripcion());
		
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de TipoPeticion en una lista de TipoPeticionDTO.  
	* @param entidades a convertir
	* @return dtos List<TipoPeticionDTO>
	* @generated
	*/
	public List<TipoPeticionDTO> convertirEntidad(List<TipoPeticion> entidades){
		List<TipoPeticionDTO> dtos=new ArrayList<TipoPeticionDTO>();
		for(TipoPeticion entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
