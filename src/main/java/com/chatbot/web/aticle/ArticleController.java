package com.chatbot.web.aticle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/aricles")

public class ArticleController {
//    @Autowired
//    ArticleRepository articleRepository;
//    @Autowired
//    EntityManager manager;
}
