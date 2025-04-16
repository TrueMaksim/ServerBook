package service;

import essence.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import repo.BookRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    // конструктоp
    public BookService(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }
    public Page<Book> getPaginatedBooks(int page, int size) {
        return bookRepository.findAll(PageRequest.of(page, size));
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow();
    }
}
