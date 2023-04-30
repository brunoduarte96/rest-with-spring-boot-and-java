package br.com.duarte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.duarte.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	

}