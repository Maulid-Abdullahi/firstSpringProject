package com.example.firstSpringProject.bootstrap;

import com.example.firstSpringProject.model.Author;
import com.example.firstSpringProject.model.Book;
import com.example.firstSpringProject.model.Publisher;
import com.example.firstSpringProject.repositories.AuthorRepository;
import com.example.firstSpringProject.repositories.BookRepository;
import com.example.firstSpringProject.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        /*----------------------------*/
        Author eric = new Author();
        eric.setFirstname("Erick");
        eric.setLastname("Njuguna");
        authorRepository.save(eric);
        /*---------------------------*/
        Book book = new Book();
        book.setTitle("The River and the Source");
        book.setIsbn("3457Reg");

        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        bookRepository.save(book);
        /*---------------------------*/
        Publisher publisher = new Publisher();
        publisher.setName("Tracom Academy");
        publisher.setAddress("Pangani");
        publisher.setCity("Nairobi");

        book.setPublisher(publisher);
        publisher.getBooks().add(book);

       // publisherRepository.save(publisher);



        /*---------------------------*/
        Author maulid = new Author();
        maulid.setFirstname("Maulid");
        maulid.setLastname("Abdullahi");

        authorRepository.save(maulid);
        /*---------------------------*/
        Book books= new Book();
        books.setTitle("Data Structure and Algorithm");
        books.setIsbn("6757Reg");

        books.setPublisher(publisher);
         publisher.getBooks().add(books);
//       publisherRepository.save(publisher);

        maulid.getBooks().add(books);
        books.getAuthors().add(maulid);
        bookRepository.save(books);




        System.out.println("Started BootStrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of books assign to publisher: " + publisher.getBooks().size());

    }
}
