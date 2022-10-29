package com.example.demo.controller;


import com.example.demo.RabbitMQSender;
import com.example.demo.model.Student;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentConroller {


    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${javainuse.rabbitmq.exchange}")
    private String exchange;

    @Value("${javainuse.rabbitmq.routingkey}")
    private String routingkey;

    @PostMapping("/post")
    public ResponseEntity<Student> postStudent(@RequestBody Student student) {
        System.out.println("here");
        System.out.println("exchange "+exchange);
        System.out.println("routingkey "+routingkey);
        rabbitTemplate.convertAndSend(exchange, routingkey, student);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
