package discos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Información del Disco")
@Entity
@Table(name = "disco")
public class Disco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_disco;

	@ApiModelProperty(notes = "Nombre de disco debe tener al menos 8")
	@Size(min = 8, max = 50, message = "nombres minimo 8 caracteres")
	@Column(name = "titulo", nullable = false, length = 50)
	String titulo;
	
	@ApiModelProperty(notes = "Es el año de lanzamiento del disco")
	@Column(name = "ano", nullable = false)
	String ano;

	@ApiModelProperty(notes = "El precio con 2 decimales")
	@Digits(integer=10, fraction=2)
	@Column(name = "precio", nullable = false)
	Float precio;
	
	@ApiModelProperty(notes = "Artista del disco")
	@Column(name = "artista", nullable = false, length = 50)
	String artista;
	
	public Integer getId() {
		return id_disco;
	}

	public void setId(Integer id_disco) {
		this.id_disco = id_disco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}	
	

}