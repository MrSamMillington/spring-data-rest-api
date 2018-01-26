package com.sjmillington;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    //spring data works with howe formats

    //profile gives alps -> used to generate documentation using profile url
    //cna use json scheme -> add a header, key = Accept, value = application/json+schema when sending a request to the profile url



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
