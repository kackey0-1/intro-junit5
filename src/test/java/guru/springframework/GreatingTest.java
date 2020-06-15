package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeEach
    void setup() {
        System.out.println("#");
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        String name = "Hoge";
        System.out.println(greeting.helloWorld(name));
        assertEquals("Hello Hoge", greeting.helloWorld(name));
    }
}