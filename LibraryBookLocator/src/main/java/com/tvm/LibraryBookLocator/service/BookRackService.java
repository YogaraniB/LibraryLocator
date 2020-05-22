package com.tvm.LibraryBookLocator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvm.LibraryBookLocator.model.BookRack;
import com.tvm.LibraryBookLocator.repository.BookRackRepository;

@Service
public class BookRackService  {

	@Autowired
	BookRackRepository repo;
	
	// view All
		public List<BookRack> findAll() {
			return repo.findAll();
		}

		// Delete by id
		public void deleteById(Integer id) {
			repo.deleteById(id);
		}

		// save
		public void save(BookRack b) {
			repo.save(b);
		}

		// get by id
		public BookRack getBookRackById(Integer id) {
			// repo.getOne(id);
			return repo.findById(id).get();
		}

		 public Optional<BookRack> getlist(Integer id) {
			 Optional<BookRack> ob = repo.findById(id);
			 return ob; }
		 

	/*
	 * public List<BookRack> getbyIdAndPassword(Integer BookRackid, Integer password) {
	 * List<BookRack> l = repo.getbyIdAndPassword(BookRackid, password); return l; }
	 */
	/*
	 * public List<BookRack> getbyId(Integer BookRackid) { List<BookRack> l =
	 * repo.getbyId(BookRackid); return l; }
	 * 
	 * public List<BookRack> getbyRack(Integer BookRackid) { List<BookRack> l =
	 * repo.getbyRack(BookRackid); return l; }
	 * 
	 * public List<BookRack> getbyName(Integer BookRackName) { List<BookRack> l =
	 * repo.getbyName(BookRackName); return l; }
	 */

		public BookRack update(BookRack b) {
			
			
			Optional<BookRack> ob = repo.findById(b.getId());
			if (ob.isPresent()) {
				BookRack newb = ob.get();
				
				newb.setBookRackId(b.getBookRackId());
				newb.setBookType(b.getBookType());
				
				newb = repo.save(newb);
				return newb;
			} else {
				b = repo.save(b);
				return b;
			}
		}

	
	
}
