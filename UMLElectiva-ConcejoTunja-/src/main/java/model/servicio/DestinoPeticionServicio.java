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
@Path("/DestinoPeticion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DestinoPeticionServicio {
	
	@EJB
    private DestinoPeticionLogica logica;

	/**
      * retorna una lista con los DestinoPeticion que se encuentran en la base de datos
      * @return retorna una lista de DestinoPeticionDTO
      * @generated
      */
    @GET
    public List<DestinoPeticionDTO> obtenerTodosDestinoPeticions(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento DestinoPeticion
      * @return DestinoPeticion del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public DestinoPeticionDTO obtenerDestinoPeticion(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de DestinoPeticion
      * @param dto DestinoPeticion a guardar
      * @return DestinoPeticion con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public DestinoPeticionDTO guardarDestinoPeticion(DestinoPeticionDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro DestinoPeticion con el identificador dado
     * @param id identificador del DestinoPeticion
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarDestinoPeticion(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
