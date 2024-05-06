package example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author CTRLY
 * @version 1.1.0
 */
@SpringBootApplication(scanBasePackages = "example")
public class ExampleApplication {
    public static void main( String[] args ) {
        SpringApplication.run( ExampleApplication.class, args );
    }
}
