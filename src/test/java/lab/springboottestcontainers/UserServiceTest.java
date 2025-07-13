package lab.springboottestcontainers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.Import;

@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@Import(TestcontainersConfiguration.class)
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void createUser() {
        // Given
        String name = "font";

        // When
        User user = userService.createUser(name);

        // Then
        assertThat(user.getName()).isEqualTo(name);
    }
}
