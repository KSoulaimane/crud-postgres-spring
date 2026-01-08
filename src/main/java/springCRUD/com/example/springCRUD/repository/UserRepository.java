package springCRUD.com.example.springCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springCRUD.com.example.springCRUD.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmail(String email);

    User getAllById(Integer id);
}
