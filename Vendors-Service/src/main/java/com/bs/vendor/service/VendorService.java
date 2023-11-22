package com.bs.vendor.service;

import org.springframework.stereotype.Service;

import com.bs.vendor.entity.Books;
@Service
public interface VendorService {

	Books addbooks(Books book);

}
