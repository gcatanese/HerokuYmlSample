package com.perosa;

import com.perosa.controller.Root;
import com.perosa.util.ApplicationProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static final String JSON_CONTENT_TYPE = "application/json";

    @Autowired
    private ApplicationProperty applicationProperty;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("Starting service " + applicationProperty.getName());
    }
}
