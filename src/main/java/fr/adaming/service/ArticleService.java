package fr.adaming.service;

import java.util.List;

import fr.adaming.beans.Article;
import fr.adaming.dao.IArticleDAO;

public class ArticleService implements IArticleService{
	
	IArticleDAO dao;
	
	
	//Setter de l'objet "dao"
	public void setDao(IArticleDAO dao) {
		this.dao = dao;
	}
	
	
	
/***************************************************************************
 * methode pour ajouter un pour article : lien entre base de donnee et vue *
 ***************************************************************************/
	@Override
	public int ajouterArticle(Article a) {
		return dao.addArticle(a);
	}

	
	
/***********************************************
 * methode pour afficher la liste des articles *	
 ***********************************************/
	@Override
	public List<Article> afficheListe() {
		return dao.getListArticle();
	}

	
/*****************************************************
 * methode pour afficher la description	d'un article *
 *****************************************************/
	@Override
	public Article descriptionArticle(int id) {
		return dao.descArticle(id);
	}

}
