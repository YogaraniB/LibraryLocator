package com.tvm.LibraryBookLocator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tvm.LibraryBookLocator.model.Book;
import com.tvm.LibraryBookLocator.model.BookRack;
import com.tvm.LibraryBookLocator.repository.BookRepository;
import com.tvm.LibraryBookLocator.service.BookService;
import com.tvm.LibraryBookLocator.service.BookRackService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@Autowired
	BookRackService rackservice;
	
	@RequestMapping(value= {"/"}, method = RequestMethod.GET)
	public String index() {
		System.out.println("Login Page");
		return "Login";
	}
	
	@RequestMapping(value= {"/logout"}, method = RequestMethod.GET)
	public String LOGOUT() {
		System.out.println("Logged out Page");
		return "Login";
	}
	@RequestMapping(value= {"/header"})
	public String header() {
		System.out.println("header Page");
		return "header";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView formvalidation(@RequestParam String user , @RequestParam String pass) {
		String username = user;
		String password = pass;
		String wrong="Sorry! Invalid Username or Password...";
		if (username.equals("admin") && password.equals("123")) {
			return new ModelAndView("index");
		} else {
			return new ModelAndView("Login","wrong",wrong);
		}

	}
	@RequestMapping("/registerBook")
	public ModelAndView register() {
		System.out.println("Registration Page");
		List<BookRack> l=rackservice.findAll();
		l.forEach((i)->System.out.println(i.getBookRackId() +" " +i.getBookType() +" " +i.getId()));
		return  new ModelAndView("registrationformBook","li",l);
	}
	@RequestMapping("/registersaveBook")
	public String registersaveBook(@ModelAttribute("l") Book b) {
		service.save(b);
		System.out.println("Successfully Saved to database");
		return "index";
	}
	@RequestMapping("/searchbyId")
	public ModelAndView searchbyId(@ModelAttribute("l") Book b) {
		List<Book> q=service.getbyId(b.getBookId());
		System.out.println(q.size());
		System.out.println("Successfully Fetched from database");
		if(q.size()!=0) {
			return new ModelAndView("index","li",q);
		}
		else {
			String s="Sorry!,No Books available for the Selected id "+b.getBookId();
			
			return new ModelAndView("index","s",s);
		}
		
	}
	@RequestMapping("/searchbyName")
	public ModelAndView searchbyName(@ModelAttribute("l") Book b) {
		List<Book> q=service.getbyName(b.getBookName());
		System.out.println(q.size());
		System.out.println("Successfully Fetched from database");
		if(q.size()!=0) {
			return new ModelAndView("index","li",q);
		}
		else {
			String s="Sorry!,No Books available for the Selected book name "+b.getBookName();
			
			return new ModelAndView("index","s",s);
		}
	}
	@RequestMapping("/addBookRack")
	public String addbookRack() {
		System.out.println("Adding BookRack Page");
		return "addBookRackPage";
	}
	@RequestMapping("/registersaveBookRack")
	public String registersaveBookRack(@ModelAttribute("l") BookRack b) {
		rackservice.save(b);
		System.out.println("Successfully Saved to database");
		return "index";
	}
	@RequestMapping("/getAllBooks")
	public ModelAndView getAllBooks() {
		List<Book> l=service.findAll();
		System.out.println("Successfully Saved to database");
		return  new ModelAndView("getAllBooks","li",l);
	}
}
