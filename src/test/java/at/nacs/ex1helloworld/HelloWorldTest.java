package at.nacs.ex1helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldTest {

    @Autowired
    HelloWorld helloWorld;

    @Test
    void getMessage() {
        assertEquals("Hello World.", helloWorld.getMessage());
    }
}