package com.tvm.LibraryBookLocator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tvm.LibraryBookLocator.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

	
	@Query(value="SELECT p from Book p WHERE p.bookId=?1 ")
	List<Book> getbyId(Integer bookid);
	
	@Query(value="SELECT p.bookRack from Book p WHERE p.bookId=?1 ")
	List<Book> getbyRack(Integer bookid);

	@Query(value="SELECT p from Book p WHERE p.bookName=?1 ")
	List<Book> getbyName(String bookName);

}
