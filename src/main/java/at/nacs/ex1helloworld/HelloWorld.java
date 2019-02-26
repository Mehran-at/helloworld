package at.nacs.ex1helloworld;
//      Create the HelloWorld bean using the @Component annotation that returns the message “Hello World”.
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public String getMessage(){
        return "Hello World.";
    }

}
