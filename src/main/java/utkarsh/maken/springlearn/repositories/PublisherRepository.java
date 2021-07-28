package utkarsh.maken.springlearn.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import utkarsh.maken.springlearn.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
