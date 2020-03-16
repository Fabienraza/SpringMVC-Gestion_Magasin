package fr.adaming.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.adaming.beans.Article;
import fr.adaming.service.IArticleService;



@Controller
public class ArticleController {
	
	@Autowired
	IArticleService daoservice;
	
	
	
	//Setter pour instancier l'objet "daoservice"
	public void setDaoservice(IArticleService daoservice) {
		this.daoservice = daoservice;
	}
	
	
	
/**************************************************************
 * Affichage liste article : lien entre controller et service *
 **************************************************************/
	@RequestMapping (value="/liste", method=RequestMethod.GET)
	public String afficheListeArticle(Model model) {
		List<Article> liste = new ArrayList<Article>();
		liste = daoservice.afficheListe();
		model.addAttribute("listeArticles", liste);
		return "listearticle";
	}


	
/*************************************************************************
 * methode pour rechercher un article : lien entre controller et service *
 *************************************************************************/
		@RequestMapping (value="/find/{id}", method=RequestMethod.GET)
		public String afficheEtudiant(Model model, @PathVariable int id) {
			Article article = new Article();
			article = daoservice.descriptionArticle(id);
			model.addAttribute("FindArticle",article);	
			return "findarticle";
		}	
	
	
}
