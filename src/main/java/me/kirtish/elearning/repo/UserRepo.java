package me.kirtish.elearning.repo;
import me.kirtish.elearning.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {


Optional<User> findUserById(Long id);

}
