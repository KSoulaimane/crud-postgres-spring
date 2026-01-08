package springCRUD.com.example.springCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springCRUD.com.example.springCRUD.entity.User;
import springCRUD.com.example.springCRUD.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/id/{id}")
    public User getById(@PathVariable("id") Integer id){
        return userService.getById(id);
    }

    @GetMapping("/email/{email}")
    public List<User> getByEmail(@PathVariable("email") String email){
        return userService.getByEmail(email);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/id/{id}")
    public List<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

}
