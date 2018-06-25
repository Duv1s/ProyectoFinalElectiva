package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
  *  
  *  @author Duv1s
  *  @generated	  
*/
@Entity
@Table(name="Evento")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Evento.obtenerTodos", query="select e from Evento e")
})
public class Evento {

	/**
	 * Identificador de la tabla Evento. 	
	 */
	@Id
    //@Column(name = "Evento_id")
    @GeneratedValue(generator = "EventoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EventoGen", sequenceName = "Evento_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
  
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fecha")
    private Date fecha;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "descripcion")
    private String descripcion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "ubicacion")
    private String ubicacion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "costo")
    private Double costo;
    
    
    
  
    
    /**
    * @generated
    */
    public Date getFecha() {
        return this.fecha;
    }
    
    /**
    * @generated
    */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    /**
    * @generated
    */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
    * @generated
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
    * @generated
    */
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    /**
    * @generated
    */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    /**
    * @generated
    */
    public Double getCosto() {
        return this.costo;
    }
    
    /**
    * @generated
    */
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
	
}
