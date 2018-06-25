package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author Duv1s
  *  @generated	  
*/
@Entity
@Table(name="Peticion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Peticion.obtenerTodos", query="select e from Peticion e")
})
public class Peticion {

	/**
	 * Identificador de la tabla Peticion. 	
	 */
	@Id
    //@Column(name = "Peticion_id")
    @GeneratedValue(generator = "PeticionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PeticionGen", sequenceName = "Peticion_SEQ",allocationSize = 1)
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
    * 1-1-false
    */
    
    //@Column(name = "anexo")
    private String anexo;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoPeticion tipoPeticion;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private DestinoPeticion destinoPeticion;
    
    
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
    
    /**
    * @generated
    */
    public String getAnexo() {
        return this.anexo;
    }
    
    /**
    * @generated
    */
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    
	
	/**
	* @generated
	*/
	public TipoPeticion getTipoPeticion() {
	    return this.tipoPeticion;
	}
	
	/**
	* @generated
	*/
	public void setTipoPeticion(TipoPeticion tipoPeticion) {
	    this.tipoPeticion = tipoPeticion;
	}
	
	/**
	* @generated
	*/
	public DestinoPeticion getDestinoPeticion() {
	    return this.destinoPeticion;
	}
	
	/**
	* @generated
	*/
	public void setDestinoPeticion(DestinoPeticion destinoPeticion) {
	    this.destinoPeticion = destinoPeticion;
	}
	
}
