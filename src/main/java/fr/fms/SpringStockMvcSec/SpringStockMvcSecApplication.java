package fr.fms.SpringStockMvcSec;

import fr.fms.SpringStockMvcSec.dao.ArticleRepository;
import fr.fms.SpringStockMvcSec.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStockMvcSecApplication implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringStockMvcSecApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        articleRepository.save(new Article(null, "Samsung", "Samsung S8", 250));
        articleRepository.save(new Article(null, "Samsung", "Samsung S9", 300));
        articleRepository.save(new Article(null, "Apple", "Iphone 10", 500));
        articleRepository.findAll().forEach(a -> System.out.println(a));
    }
}
