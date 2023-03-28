package org.rohuu.springbootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //this annotation tells spring that, this class is the starting point for our application
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class,args);
        // this static class' run method tells spring that start the application which is CourseApi.class here then create a servlet container
        // and host this application in that servlet container and make it available
    }
}