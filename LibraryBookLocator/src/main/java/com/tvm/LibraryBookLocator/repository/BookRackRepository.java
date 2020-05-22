package com.tvm.LibraryBookLocator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvm.LibraryBookLocator.model.BookRack;

public interface BookRackRepository extends JpaRepository<BookRack,Integer> {

	

}
