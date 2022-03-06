package com.perosa.controller;

import com.perosa.util.ApplicationProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class Root {

    private static final Logger LOGGER = Logger.getLogger(Root.class.getName());

    @Autowired
    private ApplicationProperty applicationProperty;

    // reply to /
    @RequestMapping(value = "/rest1", method = GET)
    public String home(HttpServletRequest request) {

        return "Hello from " + applicationProperty.getName();

    }

}
