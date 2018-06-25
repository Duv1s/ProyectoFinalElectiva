package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author Duv1s
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConcejalDTO {

    public ConcejalDTO(){
        //constructor base
    }
    
    public ConcejalDTO(Long id){
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
    private String nombres;
    
    /**
    * @generated
    */
    private String apellidos;
    
    
    /**
    * @generated
    */
    private PeticionDTO peticion;
    
    
    
    /**
    * @generated
    */
    private List<EventoDTO> evento;
    
    public List<EventoDTO> getEvento(){
    	if(this.evento==null){
    		evento=new ArrayList<EventoDTO>();
    	}
    	return evento;
    }
    
    public void setEvento(List<EventoDTO> evento){
    	this.evento=evento;
    }
    
    /**
    * @return
    * @generated
    */
    public String getNombres() {
        return this.nombres;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    /**
    * @return
    * @generated
    */
    public String getApellidos() {
        return this.apellidos;
    }
    
    /**
    * @param
    * @generated
    */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
	/**
	* @return
	* @generated
	*/
	public PeticionDTO getPeticion() {
	    return this.peticion;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setPeticion(PeticionDTO peticion) {
	    this.peticion = peticion;
	}
	
}
