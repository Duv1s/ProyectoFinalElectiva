package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
  * @generated
  *  @author Duv1s
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventoDTO {

    public EventoDTO(){
        //constructor base
    }
    
    public EventoDTO(Long id){
        this.id=id;
    }

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
 
    /**
    * @generated
    */
    private String fecha;
    
    /**
    * @generated
    */
    private String descripcion;
    
    /**
    * @generated
    */
    private String ubicacion;
    
    /**
    * @generated
    */
    private Double costo;
    
    
    
    /**
    * @return
    * @generated
    */
    public String getFecha() {
        return this.fecha;
    }
    
    /**
    * @param
    * @generated
    */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
    * @return
    * @generated
    */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
    * @return
    * @generated
    */
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    /**
    * @return
    * @generated
    */
    public Double getCosto() {
        return this.costo;
    }
    
    /**
    * @param
    * @generated
    */
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
	
}
