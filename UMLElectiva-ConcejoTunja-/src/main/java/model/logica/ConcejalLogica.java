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
public class ConcejalLogica {
	
	@EJB
    private ConcejalDAO persistencia;


	
	/**
	* Retorna una lista con los Concejal que se encuentran en la base de datos
	* @return retorna una lista de ConcejalDTO
	* @generated
	*/
	public List<ConcejalDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Concejal dado su identificador. 	
	* @param id identificador del elemento Concejal
	* @return Concejal del id dado
	* @generated
	*/
	public ConcejalDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Concejal
	 * @param dto Concejal a guardar
	 * @return Concejal con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public ConcejalDTO guardar(ConcejalDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Concejal con el identificador dado
	 * @param id identificador del Concejal
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Concejal
	 * @param dto Concejal a guardar
	 * @generated
	 */
	public void actualizar(ConcejalDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un ConcejalDTO en la entidad Concejal.  
	* @param dto a convertir
	* @return entidad Concejal
	* @generated
	*/
	public Concejal convertirDTO(ConcejalDTO dto){
		if(dto==null)return null;
		Concejal entidad=new Concejal();
		entidad.setId(dto.getId());
			entidad.setNombres(dto.getNombres());
			entidad.setApellidos(dto.getApellidos());
		
			if(dto.getPeticion()!=null){
				entidad.setPeticion(new Peticion());
				entidad.getPeticion().setId(dto.getPeticion().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  ConcejalDTO en una lista de Concejal.  
	* @param dtos a convertir
	* @return entidades List<Concejal>
	* @generated
	*/
	public List<Concejal> convertirDTO(List<ConcejalDTO> dtos){
		List<Concejal> entidades=new ArrayList<Concejal>();
		for(ConcejalDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Concejal en un DTO ConcejalDTO.  
	* @param entidad a convertir
	* @return dto ConcejalDTO
	* @generated
	*/
	public ConcejalDTO convertirEntidad(Concejal entidad){
		ConcejalDTO dto=new ConcejalDTO();
		dto.setId(entidad.getId());
				dto.setNombres(entidad.getNombres());
				dto.setApellidos(entidad.getApellidos());
		
			if(entidad.getPeticion()!=null){
				dto.setPeticion(
					new PeticionDTO(
						entidad.getPeticion().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Concejal en una lista de ConcejalDTO.  
	* @param entidades a convertir
	* @return dtos List<ConcejalDTO>
	* @generated
	*/
	public List<ConcejalDTO> convertirEntidad(List<Concejal> entidades){
		List<ConcejalDTO> dtos=new ArrayList<ConcejalDTO>();
		for(Concejal entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
