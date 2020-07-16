package com.chatbot.web.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
// 빌드패턴으로 @DATA 를 쓰지말고 게터 세터 tostring 으로 분리 필요
@ToString
@NoArgsConstructor
@Table(name = "member", uniqueConstraints = {@UniqueConstraint(columnNames = {"nickname"})})
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "member_id") private Long id;
    @Column(name = "email", nullable = false) private String email;
    @Column(name = "nickname", nullable = false) private String nickname;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password" , nullable = false) private String password;
    @Column(name = "phone", nullable = false) private String phone;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "ssn", nullable = false) private String ssn;
    @Column(name = "gender", nullable = false) private String gender;
    @Column(name = "join_date", nullable = false) private String join_date;
    @Column(name = "join_way", nullable = false) private String join_way;
    @Column(name = "withdrawal", nullable = false) private String withdrawal;
    @Column(name = "admin", nullable = false) private int admin;
    @Column(name = "volunteer_score", nullable = false) private int volunteer_score;
    @Column(name = "volunteer_score_count", nullable = false) private int volunteer_score_count;
    @Column(name = "request_score", nullable = false) private int request_score;
    @Column(name = "request_score_count", nullable = false) private int request_score_count;
    @Column(name = "point", nullable = false) private int point;








}