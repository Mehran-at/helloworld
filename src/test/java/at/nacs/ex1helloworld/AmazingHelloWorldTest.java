package at.nacs.ex1helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AmazingHelloWorldTest {
    @Autowired
    AmazingHelloWorld amazingHelloWorld;

    @Test
    void say() {
        String actual = amazingHelloWorld.say();
        String expected = "Hello World.";
        Assertions.assertEquals(expected, actual);
    }
}