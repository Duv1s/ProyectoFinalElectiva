package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author Duv1s
  *  @generated	  
*/
@Entity
@Table(name="TipoPeticion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="TipoPeticion.obtenerTodos", query="select e from TipoPeticion e")
})
public class TipoPeticion {

	/**
	 * Identificador de la tabla TipoPeticion. 	
	 */
	@Id
    //@Column(name = "TipoPeticion_id")
    @GeneratedValue(generator = "TipoPeticionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoPeticionGen", sequenceName = "TipoPeticion_SEQ",allocationSize = 1)
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
    * 1-1-false
    */
    
    //@Column(name = "descripcion")
    private String descripcion;
    
    
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
    
	
}
