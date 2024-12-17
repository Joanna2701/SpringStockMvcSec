package fr.fms.SpringStockMvcSec.dao;

import fr.fms.SpringStockMvcSec.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
