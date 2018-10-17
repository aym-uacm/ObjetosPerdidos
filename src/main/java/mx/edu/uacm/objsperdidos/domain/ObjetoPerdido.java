package mx.edu.uacm.objsperdidos.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ObjetoPerdido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private Date fechaReporte;
	
	@Column
	private boolean estaPerdido;
	
	@Column
	private String nombre;
	
	@Column
	private String descripcion;
	
	@ManyToOne
	private Usuario usuario;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the fechaReporte
	 */
	public Date getFechaReporte() {
		return fechaReporte;
	}

	/**
	 * @param fechaReporte the fechaReporte to set
	 */
	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	/**
	 * @return the estaPerdido
	 */
	public boolean isEstaPerdido() {
		return estaPerdido;
	}

	/**
	 * @param estaPerdido the estaPerdido to set
	 */
	public void setEstaPerdido(boolean estaPerdido) {
		this.estaPerdido = estaPerdido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
