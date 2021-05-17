package com.tts.mywebsite.controller;

import com.tts.mywebsite.model.Subscriber;
import com.tts.mywebsite.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SimpleController {

    @Autowired
    private SubscriberRepository subscriberRepository;
    @GetMapping(value= "/")
    public String index(Subscriber subscriber) {
        return "home";
    }


    private Subscriber subscriber;
    @PostMapping(value = "/")
    public String addNewSubscriber(Subscriber subscriber, Model model) {
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(),
                subscriber.getAge(), subscriber.getUserName(), subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("age", subscriber.getAge());
        model.addAttribute("userName", subscriber.getUserName());
        return "home";
    }

    @GetMapping(value="/myHobbies")
    public String getHobbies() {
        return "myHobbies";
    }



}