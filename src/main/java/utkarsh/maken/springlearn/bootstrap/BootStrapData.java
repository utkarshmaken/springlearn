package utkarsh.maken.springlearn.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import utkarsh.maken.springlearn.model.Author;
import utkarsh.maken.springlearn.model.Book;
import utkarsh.maken.springlearn.model.Publisher;
import utkarsh.maken.springlearn.repositories.AuthorRepository;
import utkarsh.maken.springlearn.repositories.BookRepository;
import utkarsh.maken.springlearn.repositories.PublisherRepository;

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

        Publisher publisher = new Publisher();
        publisher.setName("McGraw");
        publisher.setCity("Dhanbad");
        publisher.setState("JH");
        publisher.setAddressLine1("Katras");
        publisherRepository.save(publisher);

        Author norman = new Author("Norman", "Vincent Peale");
        Book positive = new Book("The Power of Positive Thinking", "123321");
        norman.getBooks().add(positive);
        positive.getAuthors().add(norman);

        positive.setPublisher(publisher);
        publisher.getBooks().add(positive);

        authorRepository.save(norman);
        bookRepository.save(positive);
        publisherRepository.save(publisher);


        System.out.println("Started in Bootstrap");
        System.out.println("Total number of books = " + bookRepository.count());
        System.out.println("Publishers count = " + publisherRepository.count());
    }
}
