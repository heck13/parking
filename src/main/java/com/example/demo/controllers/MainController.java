package com.example.demo.controllers;


import com.example.demo.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller returneaza pagini web
@RestController // returneaza numai text
public class MainController {

    @Autowired
    private MyModel model;


    @RequestMapping(value = "/anatol", method = RequestMethod.GET)
    public String anatol(){
        model.setName("Hello Anatol!!!");
        model.setAge(30);

        return model.toString();
    }

}
