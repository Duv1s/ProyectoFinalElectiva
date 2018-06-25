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
public class PeticionLogica {
	
	@EJB
    private PeticionDAO persistencia;


	
	/**
	* Retorna una lista con los Peticion que se encuentran en la base de datos
	* @return retorna una lista de PeticionDTO
	* @generated
	*/
	public List<PeticionDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Peticion dado su identificador. 	
	* @param id identificador del elemento Peticion
	* @return Peticion del id dado
	* @generated
	*/
	public PeticionDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Peticion
	 * @param dto Peticion a guardar
	 * @return Peticion con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public PeticionDTO guardar(PeticionDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Peticion con el identificador dado
	 * @param id identificador del Peticion
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Peticion
	 * @param dto Peticion a guardar
	 * @generated
	 */
	public void actualizar(PeticionDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un PeticionDTO en la entidad Peticion.  
	* @param dto a convertir
	* @return entidad Peticion
	* @generated
	*/
	public Peticion convertirDTO(PeticionDTO dto){
		if(dto==null)return null;
		Peticion entidad=new Peticion();
		entidad.setId(dto.getId());
			entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setDescripcion(dto.getDescripcion());
			entidad.setAnexo(dto.getAnexo());
		
			if(dto.getDestinoPeticion()!=null){
				entidad.setDestinoPeticion(new DestinoPeticion());
				entidad.getDestinoPeticion().setId(dto.getDestinoPeticion().getId());
			}
			if(dto.getTipoPeticion()!=null){
				entidad.setTipoPeticion(new TipoPeticion());
				entidad.getTipoPeticion().setId(dto.getTipoPeticion().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  PeticionDTO en una lista de Peticion.  
	* @param dtos a convertir
	* @return entidades List<Peticion>
	* @generated
	*/
	public List<Peticion> convertirDTO(List<PeticionDTO> dtos){
		List<Peticion> entidades=new ArrayList<Peticion>();
		for(PeticionDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Peticion en un DTO PeticionDTO.  
	* @param entidad a convertir
	* @return dto PeticionDTO
	* @generated
	*/
	public PeticionDTO convertirEntidad(Peticion entidad){
		PeticionDTO dto=new PeticionDTO();
		dto.setId(entidad.getId());
				dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
				dto.setDescripcion(entidad.getDescripcion());
				dto.setAnexo(entidad.getAnexo());
		
			if(entidad.getDestinoPeticion()!=null){
				dto.setDestinoPeticion(
					new DestinoPeticionDTO(
						entidad.getDestinoPeticion().getId()));
			}
			if(entidad.getTipoPeticion()!=null){
				dto.setTipoPeticion(
					new TipoPeticionDTO(
						entidad.getTipoPeticion().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Peticion en una lista de PeticionDTO.  
	* @param entidades a convertir
	* @return dtos List<PeticionDTO>
	* @generated
	*/
	public List<PeticionDTO> convertirEntidad(List<Peticion> entidades){
		List<PeticionDTO> dtos=new ArrayList<PeticionDTO>();
		for(Peticion entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
