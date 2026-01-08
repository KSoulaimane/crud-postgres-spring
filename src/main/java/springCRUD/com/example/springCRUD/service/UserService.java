package springCRUD.com.example.springCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springCRUD.com.example.springCRUD.entity.User;
import springCRUD.com.example.springCRUD.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getById(Integer Id){
        return userRepository.getAllById(Id);
    }

    public List<User> getByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> updateUser(Integer id, User user){
        User existingUser = userRepository.getAllById(id);
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setAge(user.getAge());
        existingUser.setCity(user.getCity());
        existingUser.setEmail(user.getEmail());
        return userRepository.findAll();
    }
}
