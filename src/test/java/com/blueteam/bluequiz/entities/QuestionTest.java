package com.blueteam.bluequiz.entities;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    Question a;
    List<Answer> questionAnswers = null;
    @Test
    void builder() {
        a = new Question("1", "1", questionAnswers);
    }

    @Test
    void get_id() throws NoSuchFieldException, IllegalAccessException {
        a = new Question("1", "1", questionAnswers);
        Field field = a.getClass().getDeclaredField("_id");
        field.setAccessible(true);
        Object s = field.get(a);
        assertEquals(s, "1");
    }

    @Test
    void getQuestionTitle() throws NoSuchFieldException, IllegalAccessException {
        a = new Question("1", "1", questionAnswers);
        Field field = a.getClass().getDeclaredField("questionTitle");
        field.setAccessible(true);
        Object s = field.get(a);
        assertEquals(s, "1");
    }

    @Test
    void getQuestionAnswers() throws NoSuchFieldException, IllegalAccessException {
        a = new Question("1", "1", questionAnswers);
        Field field = a.getClass().getDeclaredField("questionAnswers");
        field.setAccessible(true);
        Object s = field.get(a);
        assertEquals(s, questionAnswers);
    }
}
