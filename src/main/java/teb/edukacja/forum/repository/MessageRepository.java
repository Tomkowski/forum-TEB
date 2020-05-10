package teb.edukacja.forum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import teb.edukacja.forum.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
}
