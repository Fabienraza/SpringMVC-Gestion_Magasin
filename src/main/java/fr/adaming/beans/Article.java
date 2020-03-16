package fr.adaming.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
	@Id
	@GeneratedValue
	private int idArticle;
	private String nomArticle;
	private String descArticle;
	private float prix;
	
	
/*****************
 * Constructeurs *	
 *****************/
	public Article() {
		
	}

	public Article(String nomArticle, String descArticle, float prix) {
		super();
		this.nomArticle = nomArticle;
		this.descArticle = descArticle;
		this.prix = prix;
	}
	
	
	
/********************
 * Getter et Setter *
 ********************/

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescArticle() {
		return descArticle;
	}

	public void setDescArticle(String descArticle) {
		this.descArticle = descArticle;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	
	
/*****************************************************
 * methode pour afficher la description de l'article *	
 *****************************************************/
	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", nomArticle=" + nomArticle + ", descArticle=" + descArticle
				+ ", prix=" + prix + "]";
	}
	
	
}
