package utkarsh.maken.springlearn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import utkarsh.maken.springlearn.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
