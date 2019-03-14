package com.ewelina.app;

import org.apache.log4j.ConsoleAppender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
//import java.util.logging.Logger;


@Controller
public class HelloController {

//    private static final Logger logger = Logger.getLogger(HelloController.class.getName());
    @GetMapping("/hello")
    public String hello(){
//        System.out.println("robi helloController");

        try {
            Logger my_log = new Logger("log.txt");
            my_log.logger.setLevel(Level.INFO);
            my_log.logger.info("robi helloController");
        } catch (Exception e){

        }


        return "hello";
    }
}
