package com.boudy.crudbook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boudy.crudbook.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
