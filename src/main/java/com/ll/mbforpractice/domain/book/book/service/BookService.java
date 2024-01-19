package com.ll.mbforpractice.domain.book.book.service;

import com.ll.mbforpractice.domain.book.book.entity.Book;
import com.ll.mbforpractice.domain.book.book.repository.BookRepository;
import com.ll.mbforpractice.domain.member.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Book createBook(Member author, String title, String body, long price) {
        Book book = Book.builder()
                .author(author)
                .title(title)
                .body(body)
                .price(price)
                .build();

        bookRepository.save(book);

        return book;
    }
}
