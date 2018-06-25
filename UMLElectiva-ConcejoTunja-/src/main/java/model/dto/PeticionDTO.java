package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author Duv1s
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeticionDTO {

    public PeticionDTO(){
        //constructor base
    }
    
    public PeticionDTO(Long id){
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
    private String nombre;
    
    /**
    * @generated
    */
    private String descripcion;
    
    /**
    * @generated
    */
    private String anexo;
    
    
    /**
    * @generated
    */
    private DestinoPeticionDTO destinoPeticion;
    
    /**
    * @generated
    */
    private TipoPeticionDTO tipoPeticion;
    
   
    /**
    * @return
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String getAnexo() {
        return this.anexo;
    }
    
    /**
    * @param
    * @generated
    */
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    
	/**
	* @return
	* @generated
	*/
	public DestinoPeticionDTO getDestinoPeticion() {
	    return this.destinoPeticion;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setDestinoPeticion(DestinoPeticionDTO destinoPeticion) {
	    this.destinoPeticion = destinoPeticion;
	}
	/**
	* @return
	* @generated
	*/
	public TipoPeticionDTO getTipoPeticion() {
	    return this.tipoPeticion;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setTipoPeticion(TipoPeticionDTO tipoPeticion) {
	    this.tipoPeticion = tipoPeticion;
	}
	
}
