package fr.adaming.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import fr.adaming.beans.Article;





public class ArticleDAO implements IArticleDAO {
	
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();

/**********************************************************
 * methode pour ajouter un article dans la base de donnee *
 **********************************************************/
	@Override
	public int addArticle(Article art) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(art);
			session.getTransaction().commit();
			session.close();
			return 1;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la partie DAO : ajout article !!!");
			return 0;
		}
	}

	
/**********************************************************************
 * methode pour afficher la liste des articles dans la base de donnee *	
 **********************************************************************/
	@Override
	public List<Article> getListArticle() {
		try {
			Session session = factory.openSession();
			return session.createQuery("from Article").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la partie DAO : liste des articles !!!");
			return null;
		}
	}

	
/*****************************************************
 * methode pour afficher la description d'un article *	
 *****************************************************/
	@Override
	public Article descArticle(int id) {
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("from Article where idArticle = :identifiant");
				query.setParameter("identifiant", id);
			return (Article) query.uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans la partie DAO : description Article");
			return null;
		}
	}
	
	

}
