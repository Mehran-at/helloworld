package at.nacs.ex1helloworld;
//      Create the AmazingHelloWorld bean using the @Component annotation that uses the combination of the Hello and
//      World beans to return the message “Hello World”.
import org.springframework.stereotype.Component;

@Component
public class AmazingHelloWorld {
    public String say() {
        return "Hello World.";
    }
}
