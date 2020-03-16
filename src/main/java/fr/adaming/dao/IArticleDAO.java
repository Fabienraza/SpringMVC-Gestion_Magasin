package fr.adaming.dao;

import java.util.List;

import fr.adaming.beans.Article;

public interface IArticleDAO {
	public int addArticle(Article art);
	public List<Article> getListArticle();
	public Article descArticle(int id);
	
}
