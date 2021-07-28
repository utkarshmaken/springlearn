package utkarsh.maken.springlearn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import utkarsh.maken.springlearn.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
