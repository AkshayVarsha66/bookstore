package com.bs.vendor.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bs.vendor.entity.Books;
@Repository
public interface BookRepo extends MongoRepository<Books, Integer> {}

