package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only called Once!!");
    }

    @BeforeEach
    void setup() {
        System.out.println("In Before Each.........");
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

    @Test
    void helloWorld2() {
        String name = "Same";
        System.out.println(greeting.helloWorld(name));
        assertEquals("Hello Same", greeting.helloWorld(name));
    }

    @AfterEach
    void testDown() {
        System.out.println("In After Each.........");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After - I am only called Once!!");
    }
}