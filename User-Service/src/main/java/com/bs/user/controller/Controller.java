package com.bs.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bs.user.entity.Books;
import com.bs.user.service.UserService;

@RestController
public class Controller {

	@Autowired
	private UserService userService;
	
	@GetMapping("allbooks")
	public List<Books> viewBooks(String allbooks) {
		return userService.getallbooks(allbooks);
	}
	
	@GetMapping("search/{name}")
	public List<Books> searchBooks(@PathVariable String name) {
		return userService.searchingBooks(name);
	}
	@GetMapping("searchbyauthor/{author}")
	public List<Books> searchByAuthor(@PathVariable String author){
		return userService.searchingBooksByauthor(author);
	}
	@GetMapping("newbooks")
	public List<Books> newBooks(String newbooks){
		return userService.newBooks(newbooks);
	}
}
