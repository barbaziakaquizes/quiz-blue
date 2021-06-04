package com.blueteam.bluequiz.service;

import com.blueteam.bluequiz.dto.QuizDto;
import com.blueteam.bluequiz.entities.Answer;
import com.blueteam.bluequiz.entities.Question;
import com.blueteam.bluequiz.entities.Quiz;
import org.junit.jupiter.api.Test;
import lombok.Builder;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransformServiceTest {

    @Test
    void transformQuizDtoToQuizEntity() {
        List <Answer> a = Arrays.asList(Answer.builder()._id("1").answerTitle("1").isCorrect(true).build());
        List<Question> q = Arrays.asList(Question.builder()._id("1").questionTitle("1").questionAnswers(a).build());
        QuizDto w = QuizDto.builder()._id("1").quizTitle("1").questions(q).build();
        Quiz z;
        TransformService x = new TransformService();
        z = x.transformQuizDtoToQuizEntity(w);
        assertEquals(w.get_id(), z.get_id());
        assertEquals(w.getQuizTitle(), z.getQuizTitle());
        assertEquals(w.getQuestions(), z.getQuestions());
    }
}
