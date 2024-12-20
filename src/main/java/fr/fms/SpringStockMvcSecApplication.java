package fr.fms;

import fr.fms.dao.ArticleRepository;
import fr.fms.entities.Article;
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
//        generateDatas();
//
//      articleRepository.findAll().forEach(a -> System.out.println(a));
    }

    private void generateDatas() {
        articleRepository.save(new Article(null, "Samsung S8", 250 ));
        articleRepository.save(new Article(null, "Samsung S9", 300 ));

    //        articleRepository.save(new Article(null, "Samsung S8", 250));
//        articleRepository.save(new Article(null, "Samsung S9", 300));
//        articleRepository.save(new Article(null, "Iphone 10", 500));;
//        articleRepository.save(new Article(0, "Iphone", "10", 500 ));
//        articleRepository.save(new Article(0, "Xiaomi", "MI11", 100 ));
//        articleRepository.save(new Article(0, "OnePlus", "9 Pro", 200 ));
//        articleRepository.save(new Article(0, "Google", "Pixel 5", 350));
//        articleRepository.save(new Article(0, "Poco", "F3", 150 ));
//        articleRepository.save(new Article(0, "Dell", "810", 550, pc));
//        articleRepository.save(new Article(0, "Asus", "F756", 600, pc));
//        articleRepository.save(new Article(0, "Asus", "E80", 700, pc));
//        articleRepository.save(new Article(0, "MacBook", "Pro", 1000, pc));
//        articleRepository.save(new Article(0, "MacBook", "Air", 1200, pc));
//        articleRepository.save(new Article(0, "IPad", "XL 5", 300, tablet));
//        articleRepository.save(new Article(0, "IPad", "XL 7", 500, tablet));
//        articleRepository.save(new Article(0, "Canon", "MG30", 50, printer));
//        articleRepository.save(new Article(0, "Canon", "MG50", 60, printer));
//        articleRepository.save(new Article(0, "HP", "800", 50, printer));
//        articleRepository.save(new Article(0, "Epson", "3T", 100, printer));
//        articleRepository.save(new Article(0, "GoPro", "7", 150, camera));
//        articleRepository.save(new Article(0, "GoPro", "10", 200, camera));
//        articleRepository.save(new Article(0, "Panasonic", "HT", 1500, tv));
//        articleRepository.save(new Article(0, "Philips", "L43", 450, tv));
    }
}
