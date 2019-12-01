package com.rahul.graphql.springbootgraphqlexample.repository;

import com.rahul.graphql.springbootgraphqlexample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
