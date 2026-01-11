package springCRUD.com.example.springCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springCRUD.com.example.springCRUD.entity.User;
import springCRUD.com.example.springCRUD.service.UserService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id){
        return userService.getById(id);
    }

    @GetMapping("/search")
    public List<User> getByEmail(@RequestParam String email){
        return userService.getByEmail(email);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}
