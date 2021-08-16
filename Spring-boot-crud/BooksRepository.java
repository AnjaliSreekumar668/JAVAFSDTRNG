package com.ust.repository;

import org.springframework.data.repository.CrudRepository;

import com.acc.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

}

