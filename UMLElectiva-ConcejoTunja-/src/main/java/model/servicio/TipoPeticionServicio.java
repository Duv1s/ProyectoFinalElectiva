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
@Path("/TipoPeticion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoPeticionServicio {
	
	@EJB
    private TipoPeticionLogica logica;

	/**
      * retorna una lista con los TipoPeticion que se encuentran en la base de datos
      * @return retorna una lista de TipoPeticionDTO
      * @generated
      */
    @GET
    public List<TipoPeticionDTO> obtenerTodosTipoPeticions(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento TipoPeticion
      * @return TipoPeticion del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public TipoPeticionDTO obtenerTipoPeticion(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de TipoPeticion
      * @param dto TipoPeticion a guardar
      * @return TipoPeticion con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public TipoPeticionDTO guardarTipoPeticion(TipoPeticionDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro TipoPeticion con el identificador dado
     * @param id identificador del TipoPeticion
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarTipoPeticion(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
