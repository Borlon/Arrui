package com.umu.arrui.boot;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.umu.arrui.repository.*;
import com.umu.arrui.domain.*;

@Configuration
@EnableAutoConfiguration
public class App {
	
    public static void main( String[] args )
    {
//        SpringApplication.run(App.class, args);
    	ConfigurableApplicationContext context = SpringApplication.run(App.class);
        ArruiRepository repository = context.getBean(ArruiRepository.class);

        // Guardar un conjunto de usuarios
        repository.save(new Arrui("AL-1", "Hembra", new Date(), new Date()));
        repository.save(new Arrui("AL-2", "Hembra", new Date(), new Date()));
        repository.save(new Arrui("AL-3", "Hembra", new Date(), new Date()));
        repository.save(new Arrui("AL-4", "Macho", new Date(), new Date()));

        // findAll heredado de la interface CrudRepository
        Iterable<Arrui> todos = repository.findAll();
        System.out.println("Listar todos los Arrui:");
        for (Arrui ar : todos) {
            System.out.println("\t" + ar);
        }
        System.out.println();


        context.close();
    }
}
