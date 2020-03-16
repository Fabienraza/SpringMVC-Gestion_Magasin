package fr.adaming.main;

import fr.adaming.beans.Article;
import fr.adaming.dao.ArticleDAO;
import fr.adaming.dao.IArticleDAO;

public class Maintest {
	public static void main(String[] args) {
		
		Article a1 = new Article("AirPod", "ecouteur sans fil", 200.0f);
		IArticleDAO dao = new ArticleDAO();
		dao.addArticle(a1);
	}
}
