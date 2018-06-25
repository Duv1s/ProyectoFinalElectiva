package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author Duv1s
  *  @generated	  
*/
@Entity
@Table(name="DestinoPeticion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="DestinoPeticion.obtenerTodos", query="select e from DestinoPeticion e")
})
public class DestinoPeticion {

	/**
	 * Identificador de la tabla DestinoPeticion. 	
	 */
	@Id
    //@Column(name = "DestinoPeticion_id")
    @GeneratedValue(generator = "DestinoPeticionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DestinoPeticionGen", sequenceName = "DestinoPeticion_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombre")
    private String nombre;
    
    
    
   
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
	
}
