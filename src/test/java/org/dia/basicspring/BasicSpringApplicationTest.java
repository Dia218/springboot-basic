package org.dia.basicspring;

import org.dia.basicspring.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicSpringApplicationTest {
    @Autowired
    private QuestionService questionService;
    
    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터:[%03d]", i);
            String content = "내용없음";
            this.questionService.createQuestion(subject, content);
        }
    }
}