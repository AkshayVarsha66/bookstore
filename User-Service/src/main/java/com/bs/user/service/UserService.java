package com.bs.user.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bs.user.entity.Books;

@Service
public
interface UserService {
	public List<Books> getallbooks(String allbooks);
	public List<Books> searchingBooks(String name);
	public List<Books> searchingBooksByauthor(String author);
	public List<Books> newBooks(String newbooks);
}
  