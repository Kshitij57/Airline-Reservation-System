package Repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import Entity.User;

public interface UserRepository extends JpaRepository<Integer , User> {

	User save(User user);

	User findAllById(int id);

}
