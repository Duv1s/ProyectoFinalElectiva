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
@Path("/Concejal")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ConcejalServicio {
	
	@EJB
    private ConcejalLogica logica;

	/**
      * retorna una lista con los Concejal que se encuentran en la base de datos
      * @return retorna una lista de ConcejalDTO
      * @generated
      */
    @GET
    public List<ConcejalDTO> obtenerTodosConcejals(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Concejal
      * @return Concejal del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public ConcejalDTO obtenerConcejal(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Concejal
      * @param dto Concejal a guardar
      * @return Concejal con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public ConcejalDTO guardarConcejal(ConcejalDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Concejal con el identificador dado
     * @param id identificador del Concejal
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarConcejal(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
