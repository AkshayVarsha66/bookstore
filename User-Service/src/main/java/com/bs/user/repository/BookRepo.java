package com.bs.user.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bs.user.entity.Books;
@Repository
public interface BookRepo extends MongoRepository<Books, Integer> {

	List<Books> findByBookname(String bookname);
	List<Books> findByAuthor(String author);
	List<Books> newBooks(Date lastday);
//	List<Books> 
	

}

