package fr.henouille;

/**
 * Say hello to any one.
 * @author henouille
 */
public class Hello {

    /**
     * Say hello to world.
     * @return The hello message.
     */
    public String sayHello() {
        return sayHello("world");
    }

    /**
     * Say hello to somebody.
     * @param name The target.
     * @return The hello message.
     */
    public String sayHello(String name) {
        return "hello, " + name;
    }



}
