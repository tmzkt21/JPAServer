package com.chatbot.web.volunteer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {
    @Autowired
    EntityManager entityManager;
    @Autowired VolunteerRepository volunteerRepository;
}
