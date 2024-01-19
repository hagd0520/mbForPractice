package com.ll.mbforpractice.domain.book.book.repository;

import com.ll.mbforpractice.domain.book.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
