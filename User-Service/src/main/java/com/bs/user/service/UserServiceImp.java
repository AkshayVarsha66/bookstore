package com.bs.user.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.user.entity.Books;
import com.bs.user.repository.BookRepo;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private BookRepo bookRepo;

	@Override
	public List<Books> getallbooks(String allbooks) {
		List<Books> albooks = bookRepo.findAll();
		return albooks;
	}

	@Override
	public List<Books> searchingBooks(String name) {
		if (bookRepo.findByBookname(name) != null){
//		System.out.println(bookRepo.findByBookname(name));
		return bookRepo.findByBookname(name);
		} else {
			return null;
		}
	}

	@Override
	public List<Books> searchingBooksByauthor(String author) {
		List<Books> allbooks = bookRepo.findByAuthor(author);
		return allbooks;
	}

	@Override
	public List<Books> newBooks(String newbooks) {
		List<Books> newbookslist = bookRepo.newBooks(Date.valueOf(newbooks));
		return newbookslist;
	}

}
