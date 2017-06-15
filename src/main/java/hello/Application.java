package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import sun.awt.AppContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
        return args -> {
            System.out.println("Beans created by Spring Boot:");
            String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
            Arrays.sort(beanDefinitionNames);
            for (String beanDefinitionName : beanDefinitionNames) {
                System.out.println(beanDefinitionName);
            }
        };
    }
}
