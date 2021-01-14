package fr.henouille;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public final void helloWithNoArgTest() {
        final Hello hello = new Hello();
        final String result = hello.sayHello();
        assertEquals("hello, world", result);
    }

    @Test
    public final void helloWitArgTest() {
        final Hello hello = new Hello();
        final String resultWicket = hello.sayHello("Wicket");
        final String resultGraak = hello.sayHello("Graak");
        assertEquals("hello, Wicket", resultWicket);
        assertEquals("hello, Graak", resultGraak);
    }


}
