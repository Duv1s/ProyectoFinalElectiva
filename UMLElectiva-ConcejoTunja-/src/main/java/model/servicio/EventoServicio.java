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
@Path("/Evento")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EventoServicio {
	
	@EJB
    private EventoLogica logica;

	/**
      * retorna una lista con los Evento que se encuentran en la base de datos
      * @return retorna una lista de EventoDTO
      * @generated
      */
    @GET
    public List<EventoDTO> obtenerTodosEventos(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Evento
      * @return Evento del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public EventoDTO obtenerEvento(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Evento
      * @param dto Evento a guardar
      * @return Evento con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public EventoDTO guardarEvento(EventoDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Evento con el identificador dado
     * @param id identificador del Evento
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarEvento(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
