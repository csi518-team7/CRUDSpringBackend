package us.team7pro.CRUDSpring.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import us.team7pro.CRUDSpring.Models.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}
