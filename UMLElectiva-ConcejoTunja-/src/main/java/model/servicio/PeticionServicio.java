package model.servicio;

import model.dto.*;
import model.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *  @author Duv1s
 *  @generated
 */
@Stateless
@Path("/Peticion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PeticionServicio {
	
	@EJB
    private PeticionLogica logica;

	/**
      * retorna una lista con los Peticion que se encuentran en la base de datos
      * @return retorna una lista de PeticionDTO
      * @generated
      */
    @GET
    public List<PeticionDTO> obtenerTodosPeticions(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Peticion
      * @return Peticion del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public PeticionDTO obtenerPeticion(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Peticion
      * @param dto Peticion a guardar
      * @return Peticion con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public PeticionDTO guardarPeticion(PeticionDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Peticion con el identificador dado
     * @param id identificador del Peticion
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarPeticion(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
