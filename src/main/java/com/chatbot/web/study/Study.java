package com.chatbot.web.study;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
// 빌드패턴으로 @DATA 를 쓰지말고 게터 세터 tostring 으로 분리 필요
@ToString
@NoArgsConstructor
public class Study {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private String id;

}
