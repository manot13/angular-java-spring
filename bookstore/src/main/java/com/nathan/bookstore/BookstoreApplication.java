package com.nathan.bookstore;

import com.nathan.bookstore.domain.Categoria;
import com.nathan.bookstore.domain.Livro;
import com.nathan.bookstore.repository.CategoriaRepository;
import com.nathan.bookstore.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication {

//	@Autowired
//	private CategoriaRepository categoriaRepository;
//	@Autowired
//	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}

//	@Override
//	public void run(String... args) throws Exception {
//		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
//
//		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem Ipsum", cat1);
//
//		cat1.getLivros().addAll(Arrays.asList(l1));
//
//		this.categoriaRepository.saveAll(Arrays.asList(cat1));
//		this.livroRepository.saveAll(Arrays.asList(l1));
//
//	}
//}
