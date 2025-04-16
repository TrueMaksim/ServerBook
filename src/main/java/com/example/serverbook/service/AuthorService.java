package service;

import essence.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repo.AuthorRepository;
@Service
//@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    //Конструктор с зависимостью
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository=authorRepository;
    }
    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElseThrow();
    }
}
