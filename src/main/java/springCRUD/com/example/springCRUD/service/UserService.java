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
}
