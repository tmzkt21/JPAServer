package com.chatbot.web.study;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class StudyController {
    @Autowired EntityManager entityManager;
}

