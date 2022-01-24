package springhibernate.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import springhibernate.app.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

}
