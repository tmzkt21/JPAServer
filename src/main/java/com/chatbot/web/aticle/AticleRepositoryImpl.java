package com.chatbot.web.aticle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface ArticleRepository extends JpaRepository<Article,Long>,ArticleService{}

interface ArticleService{
}

class ArticleRepositoryImpl extends QuerydslRepositorySupport implements ArticleService {

    public ArticleRepositoryImpl() {
        super(Article.class);
    }

}


