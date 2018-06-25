package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  
  *  @author Duv1s
  *  @generated	  
*/
@Entity
@Table(name="Concejal")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Concejal.obtenerTodos", query="select e from Concejal e")
})
public class Concejal {

	/**
	 * Identificador de la tabla Concejal. 	
	 */
	@Id
    //@Column(name = "Concejal_id")
    @GeneratedValue(generator = "ConcejalGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ConcejalGen", sequenceName = "Concejal_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombres")
    private String nombres;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "apellidos")
    private String apellidos;
    
    /**
    * @generated
    * 1-1-false
    */
  
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Peticion peticion;
    
    /**
    * @generated
    * 0--1-true 
    */
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<Evento> evento;
    
    
    /**
    * @generated
    */
    public String getNombres() {
        return this.nombres;
    }
    
    /**
    * @generated
    */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    /**
    * @generated
    */
    public String getApellidos() {
        return this.apellidos;
    }
    
    /**
    * @generated
    */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
  
	
	public List<Evento> getEvento(){
		if(evento!=null){
			evento=new ArrayList<Evento>(); 
		}
		return this.evento;
	}
	
	public void setEvento(List<Evento> evento){
		this.evento=evento;
	}
	
	/**
	* @generated
	*/
	public Peticion getPeticion() {
	    return this.peticion;
	}
	
	/**
	* @generated
	*/
	public void setPeticion(Peticion peticion) {
	    this.peticion = peticion;
	}
	
}
