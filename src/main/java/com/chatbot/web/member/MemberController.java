package com.chatbot.web.member;

import com.google.gson.JsonObject;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@CrossOrigin(origins = "*",maxAge = 3600)
@Transactional
@RestController
//@RequestMapping("/member")
public class MemberController {
    @Autowired MemberRepository memberRepository;
    @Autowired EntityManager manager;


    @GetMapping("/")
    public String test(){
        JsonObject object = new JsonObject();

        object.addProperty("title","테스트3");
        object.addProperty("content","테스트3 내용");

        JsonObject data = new JsonObject();

        data.addProperty("time","12:00");

        object.add("data",data);
        return object.toString();
    }
}
