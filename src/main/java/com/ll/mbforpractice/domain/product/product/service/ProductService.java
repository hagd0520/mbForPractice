package com.ll.mbforpractice.domain.product.product.service;

import com.ll.mbforpractice.domain.book.book.entity.Book;
import com.ll.mbforpractice.domain.product.product.entity.Product;
import com.ll.mbforpractice.domain.product.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(Book book) {
        if (book.getProduct() != null) return book.getProduct();

        Product product = Product.builder()
                .maker(book.getAuthor())
                .relTypeCode(book.getModelName())
                .relId(book.getId())
                .name(book.getTitle())
                .price(book.getPrice())
                .build();

        productRepository.save(product);

        book.setProduct(product);

        return product;
    }
}
