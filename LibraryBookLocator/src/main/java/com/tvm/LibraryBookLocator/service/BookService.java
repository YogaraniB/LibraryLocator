package com.tvm.LibraryBookLocator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvm.LibraryBookLocator.model.Book;
import com.tvm.LibraryBookLocator.repository.BookRepository;

@Service
public class BookService  {

	@Autowired
	BookRepository repo;
	
	// view All
		public List<Book> findAll() {
			return repo.findAll();
		}

		// Delete by id
		public void deleteById(int id) {
			repo.deleteById(id);
		}

		// save
		public void save(Book b) {
			repo.save(b);
		}

		// get by id
		public Book getBookById(int id) {
			// repo.getOne(id);
			return repo.findById(id).get();
		}

		 public Optional<Book> getlist(Integer id) {
			 Optional<Book> ob = repo.findById(id);
			 return ob; }
		 

	/*
	 * public List<Book> getbyIdAndPassword(Integer Bookid, String password) {
	 * List<Book> l = repo.getbyIdAndPassword(Bookid, password); return l; }
	 */
		public List<Book> getbyId(Integer Bookid) {
			List<Book> l = repo.getbyId(Bookid);
			return l;
		}
		
		public List<Book> getbyRack(Integer Bookid) {
			List<Book> l = repo.getbyRack(Bookid);
			return l;
		}
		
		public List<Book> getbyName(String BookName) {
			List<Book> l = repo.getbyName(BookName);
			return l;
		}

		public Book update(Book b) {
			
			
			Optional<Book> ob = repo.findById(b.getBookId());
			if (ob.isPresent()) {
				Book newb = ob.get();
				newb.setBookDescription(b.getBookDescription());
				newb.setBookName(b.getBookName());
				newb.setBookRack(b.getBookRack());
				newb.setBookType(b.getBookType());
				newb.setIsbn(b.getIsbn());
				newb = repo.save(newb);
				return newb;
			} else {
				b = repo.save(b);
				return b;
			}
		}

	
	
}
