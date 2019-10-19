package academy.learnprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class of the web MVC module to run the program from a browser
 * http://localhost:8080/
 * Add parameter name to the URL to use internationalization, i.e., http://localhost:8080?lang=pl.
 */

@SpringBootApplication
public class WebMain {

    public static void main(String[] args) {
        SpringApplication.run(WebMain.class, args);
    }
}
