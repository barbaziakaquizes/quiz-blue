package com.blueteam.bluequiz.service;

import com.blueteam.bluequiz.dto.QuizDto;
import com.blueteam.bluequiz.entities.Answer;
import com.blueteam.bluequiz.entities.Question;
import com.blueteam.bluequiz.entities.Quiz;
import com.blueteam.bluequiz.persistence.QuizResultRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SaveQuizResultServiceTest {

    @Test
    void saveQuizResult() {
        List<Answer> a = Arrays.asList(Answer.builder()._id("1").answerTitle("1").isCorrect(true).build());
        List<Question> q = Arrays.asList(Question.builder()._id("1").questionTitle("1").questionAnswers(a).build());
        Quiz w = Quiz.builder()._id("1").quizTitle("1").questions(q).build();

        double v = 1;
        String y = "ivan";
        //SaveQuizResultService.saveQuizResult(w, v, y);
    }
}
