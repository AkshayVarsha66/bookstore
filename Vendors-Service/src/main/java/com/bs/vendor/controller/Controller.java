package com.bs.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bs.vendor.entity.Books;
import com.bs.vendor.service.VendorService;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;



@RestController
public class Controller {

	@Autowired
	private VendorService vendorService;
	
	
	@PostMapping("allbooks")
	public Books viewBooks(@RequestBody Books book) {
		return vendorService.addbooks(book);
	}
}
