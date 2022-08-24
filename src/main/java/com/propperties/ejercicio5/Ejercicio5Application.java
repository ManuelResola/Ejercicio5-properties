package com.propperties.ejercicio5;

import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Ejercicio5Application implements CommandLineRunner {

    @Autowired
    MisPropiedades propiedad;

    public static void main(String[] args) {

        SpringApplication.run(Ejercicio5Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("greeting = " + propiedad.getGreeting());
        System.out.println("number = " + propiedad.getMyNumber());
        System.out.println("new.property = " + propiedad.getNewProperty());

    }


}
