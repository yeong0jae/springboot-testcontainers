package lab.springboottestcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
class SpringbootTestcontainersApplicationTests {

    @Test
    void contextLoads() {
    }

}
