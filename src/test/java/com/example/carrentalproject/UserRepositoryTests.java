package com.example.carrentalproject;

import com.example.carrentalproject.model.User;
import com.example.carrentalproject.repository.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

// Test that user repository functions


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    // Generate a test user, insert into database, and assert that they do in fact exist
    public void testCreateUser() {
       /* User user = new User();
        user.setEmail("steve@email.com");
        user.setUsername("steveo");
        user.setPassword("1234");
        user.setFirstName("Steve");
        user.setLastName("Miner");

        User savedUser = repo.save(user); // extension of CrudRepository

        User existUser = entityManager.find(User.class, savedUser.getId());

        assertThat(existUser.getId()).isEqualTo(savedUser.getId());*/
    }
}
