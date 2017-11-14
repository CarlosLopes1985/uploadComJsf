package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filme")
public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idFilme;
	@Column(length=50)
	private  String  nomeFilme;
	@Column(length=50)
	private  String   autor;
	@Column(length=50)
	private  String  caracteristica;
	@Column(length=255)
	private  String   descricao;
	@Column
	private String    imagem; //annabelle.jpg
	@Column
	private String    trailler; //www.youtube.com/ajsdhaisj


	
	
	
	public Filme() {
	}
	
	public Filme(Integer idFilme, String nomeFilme, String autor, String caracteristica, String descricao,
			String imagem, String trailler) {
		this.idFilme = idFilme;
		this.nomeFilme = nomeFilme;
		this.autor = autor;
		this.caracteristica = caracteristica;
		this.descricao = descricao;
		this.imagem = imagem;
		this.trailler = trailler;
	}
   
	
	
	
	@Override
	public String toString() {
		return "Filme [idFilme=" + idFilme + ", nomeFilme=" + nomeFilme + ", autor=" + autor + ", caracteristica="
				+ caracteristica + ", descricao=" + descricao + ", imagem=" + imagem + ", trailler=" + trailler + "]";
	}

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getTrailler() {
		return trailler;
	}

	public void setTrailler(String trailler) {
		this.trailler = trailler;
	}
	
	
	
	

}
