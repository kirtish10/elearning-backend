package me.kirtish.elearning.service;
import me.kirtish.elearning.exception.UserNotFoundException;
import me.kirtish.elearning.model.User;
import me.kirtish.elearning.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
@Service
public class UserService  {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User addUser(User user) {
    return userRepo.save(user);
    }


    public User findUserById(Long id) {
        return userRepo.findUserById(id)
                .orElseThrow(
                        () -> new UserNotFoundException("user by id" + id + " not found" ));
    }


    

}
