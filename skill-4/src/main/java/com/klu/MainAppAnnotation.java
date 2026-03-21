package com.klu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.klu")
class Config {
}

public class MainAppAnnotation {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Student s = context.getBean(Student.class);
        s.display();
    }
}
