package com.priyanka.datta.springkafkaproducer.controller;

import com.priyanka.datta.springkafkaproducer.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer userProducer;

    @RequestMapping(value = "/kafka/{message}",method = RequestMethod.GET)
    public String sendMessage(@PathVariable String message){
        userProducer.sendMessage(message);
        return "Message sent successfully";
    }
}
