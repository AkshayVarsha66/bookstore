package com.bs.vendor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.vendor.entity.Books;
import com.bs.vendor.repository.BookRepo;
@Service
public class VendorServiceImp implements VendorService{
@Autowired
private BookRepo bookRepo;
	@Override
	public Books addbooks(Books book) {
		Books newbook = new Books();
		newbook.setBookid(book.getBookid());
		newbook.setBookname(book.getBookname());
		newbook.setCatagory(book.getCatagory());
		newbook.setOverview(book.getOverview());
		newbook.setPrice(book.getPrice());
		newbook.setAuthor(book.getAuthor());
		newbook.setAvailability(book.getAvailability());
		newbook.setPublished(book.getPublished());
		newbook.setRatings(book.getRatings());
		bookRepo.save(newbook);
		return newbook;
	}

}
