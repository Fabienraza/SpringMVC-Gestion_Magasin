package fr.adaming.service;

import java.util.List;

import fr.adaming.beans.Article;

public interface IArticleService {
	public int ajouterArticle(Article a);
	public List<Article> afficheListe();
	public Article descriptionArticle(int id);
}
